package com.programs;
//perfectnum:equal to the sum of its proper divisors, 
//excluding the number itself.
import java.util.Scanner;

public class PerfectNum {

	 void main(String[] args) {
		System.out.println("main method");
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		boolean flag=isPerfect(n);
		if (flag) {
			System.out.println("perfect");
		}else {
			System.out.println("not perfect");
		}

	}
    boolean isPerfect(int n) {
    	boolean status=false;
    	int sum=0;
    	 for(int i=1;i<n/2;i++) {
    		 if(n%i==0) {
    			 System.out.println(i+"");
    			 sum=sum+i;
    		 }
    	 }
    	System.out.println("sum"+sum+"");
    	if(sum==n) {
    		status=true;
    	}
    	return status;
    }
}
