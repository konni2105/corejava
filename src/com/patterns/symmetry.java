package com.patterns;

public class symmetry {
	public static void main(String[] args) {
		
		
/*		*        *
		**      **
		***    ***
		****  ****
		**********
		****  ****
		***    ***
		**      **
		*        *
		System.out.println("butterfly");
		int n = 5;

		// TOP
		for(int i = 1; i <= n; i++) {

		    // left stars
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    // spaces
		    for(int j = 1; j <= 2*(n - i); j++) {
		        System.out.print(" ");
		    }

		    // right stars
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}

		// BOTTOM
		for(int i = n - 1; i >= 1; i--) {

		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    for(int j = 1; j <= 2*(n - i); j++) {
		        System.out.print(" ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
		
	*/
	/*	* * * * *
		  * * * *
		    * * *
		      * *
		        *
		      * *
		    * * *
		  * * * *
		* * * * *
		
		System.out.println("hourglass");
		int n=5;
		// TOP
		
		for(int i = n; i >= 1; i--) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }

		    System.out.println();
		}
		// BOTTOM
		for(int i = 2; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }

		    System.out.println();
		}
	*/
		System.out.println("Zig-Zag");
		int n = 9;

		for(int i = 1; i <= 3; i++) {
		    for(int j = 1; j <= n; j++) {

		        if((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}

}
