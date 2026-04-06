package com.constructors;

public class NoArgConstruct1 {
	int id;
	int age;
	String name;
	NoArgConstruct1(){
		System.out.println("NoArgConstrct");
		//in this noargconstrct ,if we not intialize the values then we get default values
		//re-assigning data
		id=1;
		age=22;
		name="unknown";
	}
	//instance method
	void show() {
		System.out.println("**************************");
		System.out.println(id+" "+age+" "+name);
		}
	public static void main(String args[]) {
		System.out.println("main method started!!!");
		NoArgConstruct1 n=new NoArgConstruct1();
		n.show();
		System.out.println("main method ended!!!");
	}
}
