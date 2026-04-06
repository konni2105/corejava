package com.constructors;

public class Paramtrizedconstrct {
	int id;
	int age;
	String name;
	//no arg constructor
	Paramtrizedconstrct(){
		System.out.println("NoArgConstrct");
		id=101;
		age=21;
		name="known";
		
		}
	Paramtrizedconstrct(int id,int age,String name){
		System.out.println("3-ParamtrizedConstrct");
		//default values
		id=id;
		age=age;
		name=name;
		//parametrized values
//		this.id=id;
//		this.age=age;
//		this.name=name;
		}
	public static void main(String[] args) {
		System.out.println("main method started!!!");
		Paramtrizedconstrct p=new Paramtrizedconstrct();
		p.show();
		Paramtrizedconstrct p1=new Paramtrizedconstrct(1,2,"unknown");
		p1.show();
		System.out.println("main method ended!!!");	
	}
	void show() {
		System.out.println(id+" "+age+" "+name);
		System.out.println("**************************");
		}
}
