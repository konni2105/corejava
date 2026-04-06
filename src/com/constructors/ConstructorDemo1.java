package com.constructors;


//parametrized constrct
//this--> invoke current cls obj data
public class ConstructorDemo1 {
	int sid;//default value 0
	String sname;//default value null
	
	ConstructorDemo1(){
		System.out.println("no arg constr");
		sid=101;
		sname="unknow";
	}
	ConstructorDemo1(int sid ,String sname){
		System.out.println("parametrised constr");
//		sid=sid;--> bydefault 0
//		sname=sname;--> bydefault null
		this.sid=sid;
		this.sname=sname;
	}
	void display() {
		System.out.println("sid value:"+sid);
		System.out.println("sname value:"+sname);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		ConstructorDemo1 c=new ConstructorDemo1();
		c.display();
		ConstructorDemo1 c1=new ConstructorDemo1(102,"abhi");
		c1.display();
		System.out.println("main method ended");
	}

}
