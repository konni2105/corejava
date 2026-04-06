package com.constructors;
//parametrized constructor
//this-->access current class obj data members(instance data)
public class ConstructorDemo2 {
	 int cid;
	 double csal;
	 String cname;
	 int cage;
	ConstructorDemo2(){
		cid=1;
		csal=1000.0;
		cname="unknown";
		cage=18;
		System.out.println("no arg constructor");
	}
	//while creating any obj.if we want to pass any values to the obj instance data then we need parametrized constr 
	ConstructorDemo2(int cid,double csal, String cname, int cage){
		this.cid=cid;
		this.csal=csal;
		this.cname=cname;
		this.cage=cage;
		System.out.println("4-parametrised constr ");
	}
	
	ConstructorDemo2(int id,double sal ){
		this.cid=id;
		this.csal=sal;
		System.out.println("2-parametrised constr ");
	}
	ConstructorDemo2(int id ){
		this.cid=id;
		System.out.println("1-parametrised constr ");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		ConstructorDemo2 c=new ConstructorDemo2();
		c.display();
		
		ConstructorDemo2 c1=new ConstructorDemo2(101,10000,"abhi",22);
		c1.display();
		
		ConstructorDemo2 c2=new ConstructorDemo2(102,5000);
		c2.display();
		ConstructorDemo2 c3=new ConstructorDemo2(103);
		c3.display();
		System.out.println("main method ended");
	}
	 void display() {
		System.out.println("cid:"+cid);
		System.out.println("csal:"+csal);
		System.out.println("cname:"+cname);
		System.out.println("cage:"+cage);
		System.out.println("****************************");
	}
}
