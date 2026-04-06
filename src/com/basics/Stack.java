package com.basics;

public class Stack {
	void welcome() {
		System.out.println("wlcm metd");
		System.out.println("***"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("main metd");
		hlo();//static method we called directly
		Stack s=new Stack();
		s.welcome();//instance method so we call through objrefenc
		//System.out.println("***"+Thread.currentThread().getName());
	}
	public static void hlo() {
		System.out.println("hlo metd");
		System.out.println("***"+Thread.currentThread().getName());
	}

}
