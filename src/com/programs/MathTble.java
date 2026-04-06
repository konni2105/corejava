package com.programs;

import java.util.Scanner;

public class MathTble {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print math table");
		int n=s.nextInt();
		System.out.println("enter upto where u want to print");
		int size=s.nextInt();
		for(int i=1;i<=size;i++) {
			System.out.println(n+"x"+size+"="+n*i);
		}

	}

}
