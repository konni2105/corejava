package com.jdbc;

import java.util.Scanner;

public class MainJDBC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerDAO dao = new CustomerCRUD();//loosely coupling runtimepoly

        while (true) {

            System.out.println("\n===== JDBC CRUD MENU =====");
            System.out.println("1. Create Table");
            System.out.println("2. Insert");
            System.out.println("3. Select All");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    dao.createTable();
                    break;

                case 2:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    Customer c1 =
                            new Customer(id, name, phone);

                    dao.insertCustomer(c1);
                    break;

                case 3:
                    dao.selectAll();
                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New Phone: ");
                    String uphone = sc.nextLine();

                    Customer c2 =
                            new Customer(uid, uname, uphone);

                    dao.updateCustomer(c2);
                    break;

                case 5:

                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    dao.deleteCustomer(did);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice ❌");
            }
        }
    }
}