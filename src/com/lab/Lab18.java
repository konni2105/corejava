package com.lab;
//method overloding
import java.util.Scanner;

public class Lab18 {
	static char method(int a) {
	
		return (char)a;
	}
	static int method(char c) {
		
		return (int)c;
	}
	public static void main(String[] args) {
//		int a=65;
//		char c='A';
//		System.out.println("char "+ a +"="+method(a));
//		System.out.println("int "+ c +"="+method(c));
		// using scanner
		
		Scanner sc=new Scanner(System.in);
		System.out.println("entr int");
		int num=sc.nextInt();

		System.out.println("entr char");
		char chr=sc.next().charAt(0);
		
		System.out.println("int "+ num +"="+method(num));
		System.out.println("char "+ chr +"="+method(chr));
	

	}

}
