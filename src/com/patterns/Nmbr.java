package com.patterns;

public class Nmbr {
	public static void main(String[] args) {
		
/*		1 
		2 3 
		4 5 6 
		7 8 9 10 

		System.out.println("floyd's tri");
		int n=4;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println();
		}
*/
/*		    1 
	      1 1 
	    1 2 1 
	  1 3 3 1 
	1 4 6 4 1
	 
		System.out.println("Pascal’s Triangle");//nCr
		int n = 5;

		for(int i = 0; i < n; i++) {

		    for(int j = 0; j < n - i - 1; j++) {
		        System.out.print("  ");
		    }

		    int num = 1;

		    for(int j = 0; j <= i; j++) {
		        System.out.print(num + " ");
		        num = num * (i - j) / (j + 1);
		    }

		    System.out.println();
		}
*/
	/*	1
		1 2 1
		1 2 3 2 1
		1 2 3 4 3 2 1 
		System.out.println("Palindrome Number Triangle");
		int n = 4;
		//Increasing + decreasing (mirror)
		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= i; j++) {
		        System.out.print(j + " ");
		    }

		    for(int j = i - 1; j >= 1; j--) {
		        System.out.print(j + " ");
		    }

		    System.out.println();
		}
*/
	/*	4 3 2 1
		3 2 1
		2 1
		1
		
		System.out.println("rev num tri");
		int n = 4;

		for(int i = n; i >= 1; i--) {
		    for(int j = i; j >= 1; j--) {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
*/
	}
}
