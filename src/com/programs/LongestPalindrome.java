package com.programs;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in) ;
		
		
	/*	//for numbers 
		System.out.println("enter num:");
		int n=s.nextInt();
		
		int temp=n;
		int rev=0;
		int rem=0;
		
		while(n!=0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		} */
		
		//for strings
		
		String str="madam dad mom ";
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				System.out.println("!palin");
				return;
			}
			left++;
			right--;
		}
		System.out.println("palin");
			
		}

	}


