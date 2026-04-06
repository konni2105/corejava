package com.basics;
//static and instancs methods
public class StaInsMtd {
	static void method7() {
		System.out.println("method7 called");
	}
	static void method1() {
		method2();
		System.out.println("method1");
		//method2();
	}
	static void method2() {
		method3();
		System.out.println("method2");
	}
	static void method3() {
		StaInsMtd sim=new StaInsMtd();
		sim.method4();
		System.out.println("method3");
		
	}
	void method4() {
		method5();//inst method we call directly
		System.out.println("hlo method4");
	}
	void method5() {
		method6();
		System.out.println("hlo method5");
	}
	void method6() {
		method7();//in instanc we can call static directly
		System.out.println("hlo method6");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		method1();
	}

}
