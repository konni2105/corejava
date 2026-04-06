package com.programs;
//input : 5
//output : 5*4*3*2*1=120
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number ");
		long n=s.nextInt();
		long fact=1;
		for(long i=n;i>0;i--) {
			fact=fact*i;
			
		}
		System.out.println("factorial:"+fact);
	}

}
