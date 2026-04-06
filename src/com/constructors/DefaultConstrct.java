package com.constructors;

public class DefaultConstrct {
	int id;
	int age;
	String name;
	public static void main(String[] args) {
		System.out.println("main method started!!");
		DefaultConstrct dc=new DefaultConstrct();//jvc calls automatically the defaultconstrct
		System.out.println(dc.id);//0
		System.out.println(dc.age);//0
		System.out.println(dc.name);//null
		System.out.println("main method ended!!");
	}

}
