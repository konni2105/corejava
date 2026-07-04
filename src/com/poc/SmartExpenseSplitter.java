package com.poc;

import java.sql.*;
import java.util.*;

// ================= DB CONNECTION =================
class DbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/expense_db";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

// ================= MODEL =================
class Usr {
    private String id;
    private String name;

    public Usr(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}

// ================= SPLIT =================
abstract class Split {
    protected Usr user;
    protected double amount;

    public Split(Usr user) {
        this.user = user;
    }

    public Usr getUser() { return user; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}

// ================= CHILD SPLITS =================
class EqualSplit extends Split {
    public EqualSplit(Usr user) {
        super(user);
    }
}

class ExactSplit extends Split {
    public ExactSplit(Usr user, double amount) {
        super(user);
        this.amount = amount;
    }
}

class PercentSplit extends Split {
    private double percent;

    public PercentSplit(Usr user, double percent) {
        super(user);
        this.percent = percent;
    }

    public double getPercent() { return percent; }
}

// ================= DAO =================
class UsrDAO {
    public void addUser(Usr user) {
        String query = "INSERT INTO users(id, name) VALUES (?, ?)";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("⚠ User already exists: " + user.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ExpenseDAO {
    public int addExpense(double amount, String paidBy) {
        String query = "INSERT INTO expenses(amount, paid_by) VALUES (?, ?)";
        int expenseId = 0;

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            ps.setDouble(1, amount);
            ps.setString(2, paidBy);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                expenseId = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return expenseId;
    }
}

class SplitDAO {
    public void addSplit(int expenseId, String userId, double amount) {
        String query = "INSERT INTO splits(expense_id, user_id, amount) VALUES (?, ?, ?)";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, expenseId);
            ps.setString(2, userId);
            ps.setDouble(3, amount);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// ================= SERVICE =================
class ExpenseService {

    private UsrDAO userDAO = new UsrDAO();  
    private ExpenseDAO expenseDAO = new ExpenseDAO();
    private SplitDAO splitDAO = new SplitDAO();

    public void addUser(Usr user) {
        userDAO.addUser(user);            
    }

    public void addExpense(double amount, Usr paidBy, List<Split> splits) {

        if (splits == null || splits.isEmpty()) {
            throw new IllegalArgumentException("Splits cannot be empty");
        }

        if (splits.get(0) instanceof EqualSplit) {
            double splitAmount = amount / splits.size();
            for (Split s : splits) {
                s.setAmount(splitAmount);
            }
        } 
        else if (splits.get(0) instanceof ExactSplit) {
            double total = 0;
            for (Split s : splits) total += s.getAmount();

            if (Math.abs(total - amount) > 0.01) {
                throw new RuntimeException("❌ Exact split mismatch!");
            }
        } 
        else if (splits.get(0) instanceof PercentSplit) {
            double totalPercent = 0;

            for (Split s : splits)
                totalPercent += ((PercentSplit) s).getPercent();

            if (Math.abs(totalPercent - 100) > 0.01) {
                throw new RuntimeException("❌ Percent must be 100!");
            }

            for (Split s : splits) {
                PercentSplit ps = (PercentSplit) s;
                s.setAmount((amount * ps.getPercent()) / 100);
            }
        }

        int expenseId = expenseDAO.addExpense(amount, paidBy.getId());

        for (Split s : splits) {
            splitDAO.addSplit(expenseId, s.getUser().getId(), s.getAmount());
        }

        System.out.println("✅ Expense added successfully!");
    }

    public void showBalances() {
    	

        String query = """
            SELECT u2.name AS borrower, u1.name AS lender, SUM(s.amount) AS total
            FROM splits s
            JOIN expenses e ON s.expense_id = e.expense_id
            JOIN users u1 ON e.paid_by = u1.id
            JOIN users u2 ON s.user_id = u2.id
            WHERE u1.id != u2.id
            GROUP BY borrower, lender
        """;

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n💰 BALANCES:");
            while (rs.next()) {
                System.out.println(
                    rs.getString("borrower") + " owes " +
                    rs.getString("lender") + " ₹" +
                    rs.getDouble("total")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// ================= MAIN =================

public class SmartExpenseSplitter {

    static Scanner sc = new Scanner(System.in);
    static ExpenseService service = new ExpenseService();
    static Map<String, Usr> userMap = new HashMap<>();

    public static void main(String[] args) {
    	
    	/*ExpenseService service = new ExpenseService();

        Usr A = new Usr("1", "A");
        Usr B = new Usr("2", "B");
        Usr C = new Usr("3", "C");

        service.addUser(A);
        service.addUser(B);
        service.addUser(C);

        List<Split> splits = new ArrayList<>();

        splits.add(new EqualSplit(A));
        splits.add(new EqualSplit(B));
        splits.add(new EqualSplit(C));

        service.addExpense(300, A, splits);

        service.showBalances();*/

        while (true) {
            System.out.println("\n====== SMART EXPENSE SPLITTER ======");
            System.out.println("1. Add User");
            System.out.println("2. Add Expense");
            System.out.println("3. Show Balances");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addUser();
                case 2 -> addExpense();
                case 3 -> service.showBalances();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // ================= ADD USER =================
    private static void addUser() {
    	
        System.out.print("Enter User ID: ");
        String id = sc.next();

        System.out.print("Enter Name: ");
        String name = sc.next();

        Usr user = new Usr(id, name);
        userMap.put(id, user);

        service.addUser(user);

        System.out.println("✅ User added!");
    }

    // ================= ADD EXPENSE =================
    private static void addExpense() {

        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter paid by (user id): ");
        String paidById = sc.next();

        Usr paidBy = userMap.get(paidById);

        if (paidBy == null) {
            System.out.println("❌ User not found!");
            return;
        }

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        List<Split> splits = new ArrayList<>();

        System.out.println("Choose Split Type:");
        System.out.println("1. Equal");
        System.out.println("2. Exact");
        System.out.println("3. Percent");

        int type = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter user id: ");
            String uid = sc.next();

            Usr u = userMap.get(uid);

            if (u == null) {
                System.out.println("❌ User not found!");
                return;
            }

            switch (type) {

                case 1 -> splits.add(new EqualSplit(u));

                case 2 -> {
                    System.out.print("Enter amo000unt: ");
                    double amt = sc.nextDouble();
                    splits.add(new ExactSplit(u, amt));
                }

                case 3 -> {
                    System.out.print("Enter percent: ");
                    double percent = sc.nextDouble();
                    splits.add(new PercentSplit(u, percent));
                }

                default -> {
                    System.out.println("Invalid split type!");
                    return;
                }
            }
        }

        service.addExpense(amount, paidBy, splits);
    }
}
  
   
    	
    	    	
    	    	
    	    	
    	    	

/*
 ==================================================================================
:::::::::::::::::::::TABLES::::::::::::::::::::

create database expense_db;
use expense_db;

create table users(id varchar(15) primary key,
                   name varchar(50));
create table expenses(expense_id int auto_increment primary key,
						amount double,
                        paid_by varchar(10),
                        foreign key(paid_by) references users(id));

create table splits(split_id int auto_increment primary key,
					expense_id int,
                    user_id varchar(10),
                    amount double,
                    foreign key(expense_id)references expenses(expense_id),
                    foreign key(user_id)references users(id));
  =============================================================================================
  
:::::::::::::::::::::::::: Project Overview::::::::::::::::::::::
 
 
 >>Purpose:      To split expenses among users and calculate
              👉 who owes whom and how much
              
>>Technologies used:  java-> oop: encapsulation _ usr,abstraction_ split,inheritance_eqlsplt,exactsplt,percnsplit
                    JDBC-> connect to mysql,execute sql queries,insert&retrieve data
  					mysql->store_ users ,expenses,split
  					
>> Architecture

 SmartExpenseSplitter/
│
├── src/
│   └── main/
│       └── java/
│           └── com/expensesplitter/
│
│               ├── model/
│               │   ├── Usr.java
│               │   ├── Split.java
│               │   ├── EqualSplit.java
│               │   ├── ExactSplit.java
│               │   ├── PercentSplit.java
│
│               ├── dao/
│               │   ├── DbConnection.java
│               │   ├── UsrDAO.java
│               │   ├── ExpenseDAO.java
│               │   ├── SplitDAO.java
│
│               ├── service/
│               │   ├── ExpenseService.java
│
│               ├── exception/   (optional but recommended)
│               │   ├── InvalidSplitException.java
│               │   ├── PercentMismatchException.java
│
│               └── app/
│                   ├── SmartExpenseSplitter.java   (Main - Menu Driven)
│
├── resources/
│   └── db.sql   (Database schema)
│
└── lib/
    └── mysql-connector-j.jar
    
    
 Flow 1: Add User                         Flow 2: Add Expense             
 -------------------------         -------------------------------
   Console Input                          Console Input (amount, users, split type)
       ↓                                          ↓
SmartExpenseSplitter (main)                  Main Class
      ↓										      ↓
ExpenseService.addUser()				ExpenseService.addExpense()
      ↓										     ↓
UsrDAO.addUser()						[Validate + Calculate Split]
      ↓
Database (users table)     				ExpenseDAO (insert expense)	
						  							↓
											SplitDAO (insert splits)
													↓	
    									Database (expenses + splits)
    
 
 Flow 3: Show Balances
 ----------------------------
 User selects → Show Balance
      ↓
Main Class
      ↓
ExpenseService.showBalances()
      ↓
SQL JOIN Query
      ↓
Database
      ↓
Console Output:
"B owes A ₹100"
 
 
 
 
 
>> OVERALL FLOW
 
 User (Console Input)
        ↓
Main Class (Menu)
        ↓
Service Layer (Business Logic)
        ↓
DAO Layer (Database Access)
        ↓
Database (MySQL)
 
 
>>Final Interview Answer (Use This)

I developed a Smart Expense Splitter application using Java,
 JDBC, and MySQL. It allows users to share expenses and 
 calculates balances automatically. 
 I implemented different splitting strategies such as equal, exact, and 
 percentage using OOP concepts like abstraction and inheritance. 
 The application follows a layered architecture with DAO and Service layers.
  Data is stored in MySQL, and SQL joins are used to determine who owes whom. 
  This project helped me understand real-world system design and database interaction.
  *
 
  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  📄 ✅ RESUME VERSION (Short & Powerful)
🔹 Project: Smart Expense Splitter

Technologies: Java, JDBC, MySQL

Developed a console-based application to split expenses among multiple users and calculate balances.
Implemented multiple splitting strategies (Equal, Exact, Percentage) using OOP concepts like abstraction and inheritance.
Designed a layered architecture (Presentation, Service, DAO) for better maintainability and scalability.
Integrated MySQL database using JDBC for persistent storage of users, expenses, and splits.
Used SQL JOIN queries to efficiently compute and display “who owes whom”.
Built an interactive menu-driven console interface for user operations.



🔹 Working Flow
User enters input through console
Main class calls service layer
Service layer:
Validates data
Calculates split
DAO layer stores data in database
SQL JOIN retrieves balances
  */




/*Smart Expense Splitter — MVC Flow Explanation

I developed a Smart Expense Splitter web application using Java, Servlets, JDBC, and MySQL following the MVC architecture pattern.
The purpose of the project is to manage shared expenses among multiple users and automatically calculate who owes whom.

MVC Architecture Used
1. Model Layer

The Model layer contains:

POJO classes
Business logic
Database interaction

Classes:
Usr
Split
EqualSplit
ExactSplit
PercentSplit
DAO classes
ExpenseService

Responsibilities:
				Store data
				Validate split logic
				Perform calculations
				Interact with MySQL using JDBC

Example:

Equal split calculation
Exact amount validation
Percentage validation
2. View Layer

The View layer contains JSP pages or HTML forms.

Pages:
addUser.jsp
addExpense.jsp
balances.jsp
Responsibilities:
			Collect user input
			Display balances and results
			Provide user-friendly interface

Example:
User enters:

amount
paidBy
split type
participants

through browser forms.

3. Controller Layer

The Controller layer contains Servlets.

Servlets:
AddUserServlet
AddExpenseServlet
ShowBalanceServlet
Responsibilities:
			Receive HTTP requests
			Read form data using request.getParameter()
			Call service layer methods
			Send response to JSP pages

Example:

String amount = request.getParameter("amount");
Overall MVC Flow
User (Browser)
       ↓
JSP Page (View)
       ↓
Servlet Controller
       ↓
Service Layer
       ↓
DAO Layer
       ↓
MySQL Database
       ↓
Response returned to JSP
       ↓
Displayed to User
Expense Addition Flow
Step 1: User enters expense details

User fills form in:

addExpense.jsp
Step 2: Request goes to Servlet
AddExpenseServlet

Servlet collects form data.

Step 3: Service Layer executes business logic
ExpenseService.addExpense()

Here:

split validation happens
equal/exact/percent calculations happen
Step 4: DAO Layer stores data

DAO classes execute SQL queries using JDBC.

Tables:

users
expenses
splits
Step 5: Database stores records

Data is persisted in MySQL.

Step 6: Response displayed

Servlet forwards response to JSP page.

Example:

Expense Added Successfully
Why MVC Is Important?
Advantages:
Separation of concerns
Better maintainability
Reusable business logic
Easy debugging
Scalable architecture

OOP Concepts Used
Encapsulation → Usr
Abstraction → Split
Inheritance → EqualSplit, ExactSplit, PercentSplit
Polymorphism → Different split behaviors
Database Integration

Used JDBC to:

establish connection
execute SQL queries
insert and retrieve data
calculate balances using JOIN queries
Final Interview Answer (Polished)

My project is a Smart Expense Splitter developed using Java, Servlets, JDBC, and MySQL following MVC architecture.
In the View layer, JSP pages collect user input through browser forms. The Controller layer uses Servlets to handle HTTP requests and forward data to the Service layer. The Service layer contains business logic such as equal, exact, and percentage split calculations. DAO classes interact with MySQL using JDBC to store and retrieve data. Finally, the response is sent back to the JSP page and displayed to the user.

The project uses OOP concepts like encapsulation, abstraction, inheritance, and polymorphism, and follows layered architecture for better scalability and maintainability. */






