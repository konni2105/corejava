package com.langfundm;

import java.util.Scanner;

//with return ,no arg
public class Methoddemo4 {
	
	static int method1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("entr a");
		int a=sc.nextInt();
		
		System.out.println("entr b");
		int b=sc.nextInt();
		byte sum=(byte)(a+b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("sum"+ sum);
		sc.close();
		return (byte)sum;
	}
	public static void main(String[] args) {
		double res=method1();
		System.out.println("return val"+res);
	}
}
