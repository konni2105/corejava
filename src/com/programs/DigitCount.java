package com.programs;

import java.util.Scanner;
//amstrng nmbr 
public class DigitCount {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter numbr");
	int n =s.nextInt();
	
	String digits=Integer.toString(n);
	int digitCount=digits.length();
	
	int rem=0;
	int sumP=0;
	int temp=n;
	while(n!=0) {
		rem=n%10;
		n=n/10;
		sumP=(int)(sumP+Math.pow(rem,digitCount));
	}
	if(temp==sumP) {
		System.out.println("armstrngnumbr:"+sumP);
	}else {
		System.out.println("not armstrngnumbr");
	}
	}

}