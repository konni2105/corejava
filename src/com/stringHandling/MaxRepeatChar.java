package com.stringHandling;

import java.util.Scanner;

public class MaxRepeatChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entr str:");
		String str=s.next();
		
		int[] arr=new int[127];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			
		}
		int max=0;
		int maxChar=-1;
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]>max) {
				max=arr[str.charAt(i)];
				maxChar=str.charAt(i);
				
			}
		}
		System.out.println((char)maxChar);
		
	}

}
