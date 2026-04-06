package com.programs;

import java.util.Scanner;

//first 100 prime numbers
public class Prime {

	public static void main(String[] args) {
		System.out.println("main method");
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		boolean flag=checkPrime(n);
		
		for(int i=0;i<=n;i++) {
			if (checkPrime(i)) {
			System.out.println(i+"");
		    }
		}

	}
	  static boolean checkPrime(int n) {
		  boolean status=true;
		  if(n==0||n==1) {
			  return false;
			  }
		  for(int i=1;i<n;i++) {
			  if(n%i==0) {
				  status=true;
			}
		  }
		 return status;
	 }
}
