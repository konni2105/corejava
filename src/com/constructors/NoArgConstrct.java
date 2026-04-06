package com.constructors;

public class NoArgConstrct {
	int id;
	int age;
	String name;
	NoArgConstrct(){
		System.out.println("NoArgConstrct");
	}
	public static void main(String[] args) {
		System.out.println("main method started!!");
		DefaultConstrct dc=new DefaultConstrct();
		NoArgConstrct nac=new NoArgConstrct();//here,this obj alredy exists in my package so it will works
		System.out.println(dc.id);//0
		System.out.println(dc.age);//0
		System.out.println(dc.name);//null
		System.out.println("****************");
		NoArgConstrct nc=new NoArgConstrct();
		System.out.println(nc.id);//0
		System.out.println(nc.age);//0
		System.out.println(nc.name);//null
		System.out.println("main method ended!!");	
	}
}
