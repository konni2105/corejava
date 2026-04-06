package com.programs;

import java.util.Scanner;

//I/P:123-->O/P:321
//567-->765
public class RevOfNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int temp=n;
		int rem=0;
		int rev=0;
		while(n!=0) {
			rem=n%10;//123%10->3 | 12%10->2 | 1%10->1
			n=n/10;// 123/10->12 | 12/10->1 | 1/10->0
			rev=rev*10+rem;//3-->32-->320+1-->321
			
		}
		System.out.println("revrse num:"+rev);
		if(temp==rev) {
			System.out.println("palin");
		}else {
			System.out.println("not palin");
		}
	}

}
