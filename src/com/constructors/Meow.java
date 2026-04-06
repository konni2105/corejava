package com.constructors;

//constructor chaining--> calling one const into another one
//this and super
public class Meow {
	int id;
	int age;
	String name;
	String breed;
	Meow(){
		System.out.println("no arg constructor");
		 id=101;
		 age=20;
		 name="A";
		 breed="unknown";
		}
	Meow(int id){
		this();
		this.id=id;
		System.out.println("1 arg constructor");
		}
	Meow(int id ,int age){
		this(id);
		this.age=age;
		System.out.println("2 arg constructor");
		}
	Meow(int id ,int age,String name){
		this(id,age);
		this.name=name;
		System.out.println("3 arg constructor");
		}
	Meow(int id ,int age,String name,String breed){
		this(id,age,name);
		this.breed=breed;
		System.out.println("4 arg constructor");
		}
	void display() {
		System.out.println("*************");
		//System.out.println(">meowid:"+ id +" "+ ">meowname:"+ name +" "+">meowage:"+" "+ age);
		System.out.println("meowid:"+id);
		System.out.println("meowage:"+age);
		System.out.println("meowname:"+name);
		System.out.println("meowbreed:"+breed);
		System.out.println("*************");	
	}
	public static void main(String[] args) {
		System.out.println("main method started!");
		
		Meow m=new Meow();
		m.display();
		
		Meow m1=new Meow(102);
		m1.display();
		
		Meow m2=new Meow(103,21);
		m2.display();
		
		Meow m3=new Meow(104,22,"known");
		m3.display();
		
		Meow m4=new Meow(104,23,"leo","spi");
		m4.display();
		System.out.println("main method  ended!");

	}

}