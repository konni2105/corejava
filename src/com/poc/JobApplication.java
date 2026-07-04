
package com.poc;

import java.sql.*;
import java.util.*;

// -------------------- DB CONNECTION --------------------
class DBConnection {
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/expense_db", "root", "password");
	}
}

// -------------------- POJO CLASSES --------------------
class Application {
	private int id;
	private int candidateId;
	private int jobId;
	private String status;
	//setters
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	//getters
	public int getCandidateId() {
		return candidateId;
	}

	public int getJobId() {
		return jobId;
	}

	public String getStatus() {
		return status;
	}
}

class User {
	private String username;
	private String password;

	public User(String u, String p) {
		this.username = u;
		this.password = p;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}

// -------------------- EXCEPTIONS --------------------
class DuplicateApplicationException extends Exception {
	public DuplicateApplicationException(String msg) {
		super(msg);
	}
}

class InvalidStatusException extends Exception {
	public InvalidStatusException(String msg) {
		super(msg);
	}
}

// -------------------- USER DAO --------------------
class UserDAO {

	public void register(User user) throws Exception {
		String query = "INSERT INTO user(username, password) VALUES (?, ?)";

		try (Connection con = DBConnection.getConnection(); 
				PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
		}
	}

	public boolean login(String username, String password) throws Exception {
		String query = "SELECT * FROM user WHERE username=? AND password=?";

		try (Connection con = DBConnection.getConnection(); 
				PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, username);
			ps.setString(2, password);

			try (ResultSet rs = ps.executeQuery()) {
				return rs.next();
			}
		}
	}
}

// -------------------- DAO LAYER --------------------
class ApplicationDAO {

	public void addApplication(Application app) throws Exception {
		String query = "INSERT INTO application(candidate_id, job_id, status) VALUES (?, ?, ?)";

		try (Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query)) {

			ps.setInt(1, app.getCandidateId());
			ps.setInt(2, app.getJobId());
			ps.setString(3, app.getStatus());

			ps.executeUpdate();
		}
	}

	public boolean isDuplicate(int candidateId, int jobId) throws Exception {
		String query = "SELECT * FROM application WHERE candidate_id=? AND job_id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setInt(1, candidateId);
			ps.setInt(2, jobId);

			try (ResultSet rs = ps.executeQuery()) {
				return rs.next();
			}
		}
	}

	public String getCurrentStatus(int appId) throws Exception {
		String query = "SELECT status FROM application WHERE id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setInt(1, appId);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next())
					return rs.getString("status");
			}
		}
		return null;
	}

	public void updateStatus(int appId, String newStatus) throws Exception {

		String updateQuery = "UPDATE application SET status=? WHERE id=?";
		String historyQuery = "INSERT INTO status_history(application_id, old_status, new_status) VALUES (?, ?, ?)";

		try (Connection con = DBConnection.getConnection()) {

			String oldStatus = getCurrentStatus(appId);

			// update
			try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
				ps.setString(1, newStatus);
				ps.setInt(2, appId);
				ps.executeUpdate();
			}

			// history
			try (PreparedStatement ps = con.prepareStatement(historyQuery)) {
				ps.setInt(1, appId);
				ps.setString(2, oldStatus);
				ps.setString(3, newStatus);
				ps.executeUpdate();
			}
		}
	}

	public void viewAll() throws Exception {
		String query = "SELECT * FROM application";

		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + ", Candidate: " + rs.getInt("candidate_id") + ", Job: "
						+ rs.getInt("job_id") + ", Status: " + rs.getString("status") + ", Date: "
						+ rs.getTimestamp("applied_date"));
			}
		}
	}

	public void viewHistory(int appId) throws Exception {
		String query = "SELECT * FROM status_history WHERE application_id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setInt(1, appId);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getString("old_status") + " → " + rs.getString("new_status") + " at "
							+ rs.getTimestamp("changed_at"));
				}
			}
		}
	}

	public void getByStatus(String status) throws Exception {
		String query = "SELECT * FROM application WHERE status=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, status);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					System.out.println(
							rs.getInt("id") + " | " + rs.getString("status") + " | " + rs.getTimestamp("applied_date"));
				}
			}
		}
	}
}

// -------------------- SERVICE LAYER --------------------
class ApplicationService {

	public void apply(int cId, int jId) throws Exception {
		ApplicationDAO dao = new ApplicationDAO();

		if (dao.isDuplicate(cId, jId)) {
			throw new DuplicateApplicationException("Already applied!");
		}

		Application app = new Application();
		app.setCandidateId(cId);
		app.setJobId(jId);
		app.setStatus("APPLIED");

		dao.addApplication(app);
	}

	public void changeStatus(int appId, String newStatus) throws Exception {
		ApplicationDAO dao = new ApplicationDAO();

		String current = dao.getCurrentStatus(appId);

		if (current == null) {
			throw new InvalidStatusException("Application not found!");
		}

		if ("APPLIED".equals(current) && "INTERVIEW".equals(newStatus)) {
			dao.updateStatus(appId, newStatus);
		} else if ("INTERVIEW".equals(current) && ("SELECTED".equals(newStatus) || "REJECTED".equals(newStatus))) {
			dao.updateStatus(appId, newStatus);
		} else {
			throw new InvalidStatusException("Invalid transition!");
		}
	}
}

// -------------------- MAIN CLASS --------------------
public class JobApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserDAO userDAO = new UserDAO();

		try {
			System.out.println("1. Register  2. Login");
			int ch = sc.nextInt();
			sc.nextLine();

			if (ch == 1) {
				System.out.print("Username: ");
				String u = sc.nextLine();
				System.out.print("Password: ");
				String p = sc.nextLine();
				userDAO.register(new User(u, p));
				System.out.println("Registered!");
			}

			System.out.print("Login Username: ");
			String u = sc.nextLine();
			System.out.print("Password: ");
			String p = sc.nextLine();

			if (!userDAO.login(u, p)) {
				System.out.println("Invalid login!");
				return;
			}

			System.out.println("Login Success!");

			ApplicationService service = new ApplicationService();

			while (true) {
				System.out.println("\n1.Apply 2.Update 3.View 4.Filter 5.History 6.Exit");
				int c = sc.nextInt();

				switch (c) {
				case 1:
					System.out.print("Candidate ID: ");
					int cid = sc.nextInt();
					System.out.print("Job ID: ");
					int jid = sc.nextInt();
					service.apply(cid, jid);
					break;

				case 2:
					System.out.print("App ID: ");
					int aid = sc.nextInt();
					System.out.print("Status: ");
					String st = sc.next();
					service.changeStatus(aid, st);
					break;

				case 3:
					new ApplicationDAO().viewAll();
					break;

				case 4:
					System.out.print("Enter status: ");
					new ApplicationDAO().getByStatus(sc.next());
					break;

				case 5:
					System.out.print("App ID: ");
					new ApplicationDAO().viewHistory(sc.nextInt());
					break;

				case 6:
					System.exit(0);
				}
				
		
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}


}


