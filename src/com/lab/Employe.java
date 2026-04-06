package com.lab;
public class Employe {
	int eid;
	String ename;
	double esal;
	static String companyName="TechSoft Pvt";
	
	Employe(int id,String name,double sal){
	this.eid=id;
	this.ename=name;
	this.esal=sal;
	}
	//copy constructor
	Employe(Employe e){
		this.eid=e.eid;
		this.ename=e.ename;
		this.esal=e.esal;	
	}
	public static void main(String[] args) {
		Employe e=new Employe(1,"abhi",25000.0);
		e.show();
		Employe e1=new Employe(e);
		e1.esal=50000.0;
		e1.show();
	}
	void show() {
	System.out.println("Employeid:"+eid);
	System.out.println("Employename:"+ename);
	System.out.println("Employesal:"+esal);
	System.out.println("companyname:"+companyName);
	System.out.println("***********************");
	}
}
