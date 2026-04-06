package com.constructors;
//constructor chaining using this()
public class ConstructorDemo3 {
	int eid;
	String ename;
	int eage;
	double esal;
	
	ConstructorDemo3(){
		System.out.println("no-arg constructor");
		 eid=1;
		 ename="unknown";
		 eage=20;
		 esal=55000;
	}
	ConstructorDemo3(int id){
		this();
		this.eid=id;
		System.out.println("1-paramtr constructor");
	}
	ConstructorDemo3(int id,String name){
		this(id);
		this.ename=name;
		System.out.println("2-paramtr constructor");
	}
	ConstructorDemo3(int id,String name,int age){
		this(id,name);
		this.eage=age;
		System.out.println("3-paramtr constructor");
	}
	ConstructorDemo3(int id,String name,int age,double sal){
		this(id,name,age);
		this.esal=sal;
		System.out.println("4-paramtr constructor");
	}
	public static void main(String[] args) {
		System.out.println("***main method started***");
		
		ConstructorDemo3 c=new ConstructorDemo3();
		c.show();
		ConstructorDemo3 c1=new ConstructorDemo3(2);
		c1.show();
		ConstructorDemo3 c2=new ConstructorDemo3(3,"third");
		c2.show();
		ConstructorDemo3 c3=new ConstructorDemo3(4,"four",21);
		c3.show();
		ConstructorDemo3 c4=new ConstructorDemo3(5,"five",22,65000);
		c4.show();
		
		System.out.println("***main method ended***");
	}
	void show() {
		System.out.println("*****************************");
		System.out.println("eid:"+eid);
		System.out.println("ename:"+ename);
		System.out.println("eage:"+eage);
		System.out.println("esal:"+esal);
		System.out.println("*****************************");
	}
}