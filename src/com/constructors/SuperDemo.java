package com.constructors;

public class SuperDemo {

	String model;
	String brand;

	SuperDemo(){

		System.out.println("SuperDemo no arg constructor");
	}
	//when we run SuperDemo cls that only SuperDemo mainmethod executed
	public static void main(String[] args) {
		System.out.println("SuperDemo main method");
	}
}

class Demo extends SuperDemo{

	Demo(){
		System.out.println("Demo no arg constrcutor");
		model="spy";
		brand="kia";
	}

	public static void main(String[] args) {
		System.out.println("Demo main method");
		Demo d=new Demo();
		System.out.println(d.model);
		System.out.println(d.brand);
		Demo d1=new Demo();
		d.show();
		}
	void show() {
		System.out.println("***************");
		System.out.println(this.model);
		System.out.println(super.brand);
		System.out.println("***************");
	}
}