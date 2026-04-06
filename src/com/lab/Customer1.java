package com.lab;
//calling previous constrct in upcoming constrct
class Customer1 {

    int cid;
    String cname;
    int cage;

    // No-arg constructor
    Customer1() {
        System.out.println("No-arg constructor");
    }

    // 1-arg constructor
    Customer1(int cid) {
        this();            // calls no-arg constructor
        this.cid = cid;
        System.out.println("1-arg constructor");
    }

    // 2-arg constructor
    Customer1(int cid, String cname) {
        this(cid);         // calls 1-arg constructor
        this.cname = cname;
        System.out.println("2-arg constructor");
    }

    // 3-arg constructor
    Customer1(int cid, String cname, int cage) {
        this(cid, cname);  // calls 2-arg constructor
        this.cage = cage;
        System.out.println("3-arg constructor");
    }

    // Instance method to display values
    void display() {
        System.out.println("Customer Id   : " + cid);
        System.out.println("Customer Name : " + cname);
        System.out.println("Customer Age  : " + cage);
    }

    public static void main(String[] args) {
        Customer1 c = new Customer1(101, "Pavitra", 22);
        System.out.println("----- Customer Details -----");
        c.display();
    }
}
