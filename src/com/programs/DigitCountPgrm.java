package com.programs;
import java.util.Scanner;

//amstrng nmbr 
public class DigitCountPgrm {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter numbr");
	int n =s.nextInt();
	
	//String digits=Integer.toString(n);
	//int digitCount=digits.length();
	
	int rem=0;
	int sumP=0;
	int temp=n;
	int digitCount=0;
	
	while(n!=0) {
		n=n/10;
		digitCount++;
	}
	int n1=temp;//n1==n
	System.out.println(digitCount);
	
	while(n!=0) {
		rem=n1%10;
		n1=n1/10;
		sumP=(int)(sumP+Math.pow(rem,digitCount));
	}
	System.out.println(temp);
	System.out.println(sumP);
	
	if(temp==sumP) {
		System.out.println("armstrngnumbr:"+sumP);
	}else {
		System.out.println("not armstrngnumbr");
	}
 }

}


