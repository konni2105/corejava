package com.basics;
// instance and static variables
public class Employee {
	int eid;
	String ename;
	static String orgName="Vcube";

	public static void main(String[] args) {
	 //static var so directly called in main method	
    System.out.println("orgname:"+" "+orgName);
    Employee e1=new Employee();
    e1.eid=101;
    e1.ename="Abhigna";
    System.out.println("eid:"+""+ e1.eid +" "+"ename:"+"" +new Employee().ename);
    System.out.println("====obj 2====");
    orgName="10000coders";
    System
    
    .out.println("orgname:"+" "+orgName);
    Employee e2=new Employee();
    e2.eid=201;
    e2.ename="pavitra";
    System.out.println(Employee.orgName);//by using cls name we call static var
    System.out.println(e2.orgName);//by using obj refnc we call static var
    System.out.println(orgName);//directly we called 
    System.out.println(new Employee().orgName);//by using object 
    System.out.println("eid:"+""+ e2.eid +" "+"ename:"+"" +e2.ename);
    System.out.println("====obj 3====");
    Employee e3=null;
    e3.orgName="jspiders";
    e3.eid=301;
    e3.ename="romiroheeroya";
    System.out.println(e3.orgName);//null pointer exception
    System.out.println(e3.ename);
	}

}
