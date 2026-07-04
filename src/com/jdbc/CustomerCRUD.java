package com.jdbc;

import java.sql.*;
//implements interface
public class CustomerCRUD implements CustomerDAO {

    // CREATE TABLE
    public void createTable() {

        try (Connection con = DBConnection.getConnection()) {

            String query =
                    "CREATE TABLE IF NOT EXISTS customer(" +
                    "CustomerID INT PRIMARY KEY," +
                    "CustomerName VARCHAR(100)," +
                    "PhoneNumber VARCHAR(15))";

            PreparedStatement ps = con.prepareStatement(query);

            ps.executeUpdate();

            System.out.println("Customer table created ✅");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // INSERT
    public void insertCustomer(Customer c) {

        try (Connection con = DBConnection.getConnection()) {

            String query =
                    "INSERT INTO customer VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, c.getCustomerId());
            ps.setString(2, c.getCustomerName());
            ps.setString(3, c.getPhoneNumber());

            int n = ps.executeUpdate();

            System.out.println(n + " customer inserted ✅");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // SELECT ALL
    public void selectAll() {

        try (Connection con = DBConnection.getConnection()) {

            String query = "SELECT * FROM customer";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            System.out.println("\n--- Customer Records ---");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("CustomerID") + " | " +
                        rs.getString("CustomerName") + " | " +
                        rs.getString("PhoneNumber"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateCustomer(Customer c) {

        try (Connection con = DBConnection.getConnection()) {

            String query =
                    "UPDATE customer SET CustomerName=?, PhoneNumber=? WHERE CustomerID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, c.getCustomerName());
            ps.setString(2, c.getPhoneNumber());
            ps.setInt(3, c.getCustomerId());

            int n = ps.executeUpdate();

            System.out.println(n + " customer updated ✅");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteCustomer(int id) {

        try (Connection con = DBConnection.getConnection()) {

            String query =
                    "DELETE FROM customer WHERE CustomerID=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int n = ps.executeUpdate();

            System.out.println(n + " customer deleted ✅");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
