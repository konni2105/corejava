package com.lab;
//create 2 objs to display diffnt values by doing overload
public class Lab20 {
	static int id;
	static String name;
	static int sal;
	//parametrized constructor1
	Lab20(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	//constructor2
	Lab20(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	static void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		Lab20 l = new Lab20(1,"xyz");
	display();
	//System.out.println();
	Lab20 l1=new Lab20(2,"zy",1000);
	display();
	
	}

}
