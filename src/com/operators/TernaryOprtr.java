package com.operators;

import java.util.Scanner;

public class TernaryOprtr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int n=s.nextInt();
		/* using ternary
		String res = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println(res);*/
		String res = (n > 0) ? "Positive"
		           : (n < 0) ? "Negative"
		           : "Zero";

		System.out.println(res);
	}

}
