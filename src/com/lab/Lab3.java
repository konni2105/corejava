package com.lab;
//create 2inst mtd ,2 static mthd and without calling those mthd in mainmethod dispaly all mtds
public class Lab3 {
	
	void method1() {
		System.out.println("method 1");
	}
	void method2() {
		System.out.println("method2");
		method1();
	}
	static void method3() {
		System.out.println("method3");
	   Lab3 m=new Lab3();
	   m.method2();
	}
	static void method4() {
		System.out.println("method4");
		method3();
		
	}
	static{
		method4();
	}
	{   
		System.out.println("msg");
	}
	void main(String args[]) {
		System.out.println("main method");
		
		}

}
