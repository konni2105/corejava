package com.programs;

import java.util.Scanner;

public class FactorialWithRecursion {

	void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number ");
		long n=s.nextLong();
		long factorial=findFact(n);
        long fact=1;
	}
	long findFact(long n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*findFact(n-1);
	}

}
