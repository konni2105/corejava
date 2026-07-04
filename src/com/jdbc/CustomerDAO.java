package com.jdbc;
//interface
public interface CustomerDAO {

    void createTable();

    void insertCustomer(Customer c);

    void selectAll();

    void updateCustomer(Customer c);

    void deleteCustomer(int id);
   }
