package com.operators;

public class InstanceOfOprtr {
	public static void main(String[] args) {
		Integer i=0;
		System.out.println(i instanceof Integer);//true
		System.out.println(i instanceof Number);//true
		System.out.println(i instanceof Object);//true
		//System.out.println(i instanceof String);//error 
		System.out.println(null instanceof Integer);//false
		System.out.println(null instanceof Number);//false
		System.out.println(null instanceof Object);//false
		String s="java";
		System.out.println(s instanceof String);//true
		System.out.println(s instanceof Object);//true
		
	}

	
	
}
