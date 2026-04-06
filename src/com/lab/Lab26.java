package com.lab;

import java.util.Scanner;

public class Lab26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks:");
		int marks=s.nextInt();
		String result=(marks>=40)?"pass":"fail";
		System.out.println("Result:"+result);
		}

}
