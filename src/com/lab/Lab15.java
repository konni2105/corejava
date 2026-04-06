package com.lab;
//methods:noarg:noreturn,witharg:withreturn
          //witharg:noreturn,noarg:withreturn
          
public class Lab15 {
	static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		sub(c,20);
		
	}
	static void sub(int c,int d) {
	    int e=c-d;
	    System.out.println(e);
	    mul(e,20);
	    
	}
	static void mul(int e,int f) {
		int g=e*f;
		System.out.println(g);
		div(e,30);
	}
	static void div(int g ,int h) {
		int i=g/h;
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		add(10,20);

	}

}
