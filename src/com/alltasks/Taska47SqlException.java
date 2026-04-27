package com.alltasks;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Taska47SqlException {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loads sucessfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashu", "root", "root");
		Statement st = con.createStatement();
		// create table
//		String t= "CREATE TABLE employee (
//		  empid int NOT NULL,
//		  empname varchar(20) NOT NULL,
//		  epfrmce varchar(30) DEFAULT NULL,
//		  deptno smallint DEFAULT NULL,
//		  sal int NOT NULL,
//		  PRIMARY KEY (empid)
//		)";
//		   int c=st.executeUpdate(t);
//		   System.out.println(c+"table created");
		
		
		
		// delete the data
//		String s="delete from employee where empid=20";
//		int d =st.executeUpdate(s);
//		System.out.print(d);
		
		// update the data
//		String sql = "update employee set empname='venkii' where empid=20";
//		int u = st.executeUpdate(sql);
//		System.out.println(u + "update row");

		//insert the data
//		String a = "insert into employee (empid,empname,epfrmce,sal)values(20,'S','good',2000)";
//		long in = st.executeUpdate(a);
//       System.out.println(in + "insert row");
		
		// retrieve the data
		String q = "select * from employee";
		ResultSet rs = st.executeQuery(q);
		System.out.println("------------------------------------------------------");
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "  " + rs.getString(2) + "  " + 
		rs.getString(3)+"  "+rs.getInt(4)+"   "+rs.getInt(5));
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
		 

		con.close();
	}
}
