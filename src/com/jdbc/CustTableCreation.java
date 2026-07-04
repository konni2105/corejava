package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CustTableCreation {

	public static void main(String[] args) {
		

		    try {

		        Connection con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/customer_db",
		                "root",
		                "root");

		        String query =
		                "CREATE TABLE IF NOT EXISTS customer(" +
		                "CustomerID INT PRIMARY KEY," +
		                "CustomerName VARCHAR(100)," +
		                "PhoneNumber VARCHAR(15))";

		        PreparedStatement ps = con.prepareStatement(query);

		        ps.executeUpdate();

		        System.out.println("Customer table created successfully ✅");

		        con.close();

		    } catch (Exception e) {
		        System.out.println(e);
		    }
		}
		
		
	}


