package com.constructors;
//Chaining 3 Constructors with ONE Object
public class ConstructorDemo4 {

	ConstructorDemo4() {
		this(10);
		System.out.println("No-arg constructor");
	}

	ConstructorDemo4(int x) {
		this(10, 20);
		System.out.println("1-arg constructor");
	}

	ConstructorDemo4(int a, int b) {
		System.out.println("2-arg constructor");
	}
	public static void main(String[] args) {
		ConstructorDemo4 d = new ConstructorDemo4();   // Only one object
	}


}