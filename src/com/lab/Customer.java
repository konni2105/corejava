package com.lab;
//calling next construct in the present constrct  
public class Customer {

    int cid;
    String cname;
    int cage;

    // No-arg constructor
    Customer() {
    	
        System.out.println("No-arg constructor");
        this.cid = 100;
        this.cname = "Unknown";
        this.cage = 0;

        this(101);   // call 1-arg constructor
    }

    // 1-arg constructor
    Customer(int cid) {
        System.out.println("1-arg constructor");
        this.cid = cid;

        this(cid, "Pavitra");  // call 2-arg constructor
    }

    // 2-arg constructor
    Customer(int cid, String cname) {
        System.out.println("2-arg constructor");
        this.cid = cid;
        this.cname = cname;

        this(cid, cname, 22);  // call 3-arg constructor
    }

    // 3-arg constructor
    Customer(int cid, String cname, int cage) {
        System.out.println("3-arg constructor");
        this.cid = cid;
        this.cname = cname;
        this.cage = cage;
    }

    void display() {
        System.out.println("Customer Id   : " + cid);
        System.out.println("Customer Name : " + cname);
        System.out.println("Customer Age  : " + cage);
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println("----- Customer Details -----");
        c.display();
    }
}
