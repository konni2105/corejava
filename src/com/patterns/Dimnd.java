package com.patterns;

/* 
 * Top = Pyramid
Bottom = Inverted Pyramid*/

public class Dimnd {

	public static void main(String[] args) {
		
		
		
/*  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *        
		System.out.println("full diamond");
		//Top → 2*i - 1
		//Bottom → 2*(n - i) - 1
		
		//top
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		//bottom
		for(int i=n-1;i>=1;i--) {
			for(int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
			for(int j = 1; j <= 2*i-1; j++) {
		        System.out.print("*");
		    }
			 System.out.println();
		}
	*/
		

/*	        * 
	      *   * 
	    *       * 
	  *           * 
	*               * 
	  *           * 
	    *       * 
	      *   * 
	        * 
		
		
		
		System.out.println("hollow diamond");
		
		//Print * only at First & last  position else->space
			        
		int n = 5;

		// TOP
		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }
		    for(int j = 1; j <= 2*i - 1; j++) {
		        if(j == 1 || j == 2*i - 1) {
		            System.out.print("* ");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
		//bottom
		for(int i = n-1; i >=1; i--) {

		    for(int j = 1; j<=n-i; j++) {
		        System.out.print("  ");
		    }
		    for(int j = 1; j <= 2*i - 1; j++) {
		        if(j == 1 || j == 2*i - 1) {
		            System.out.print("* ");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	*/
		
		
/*		      1 
		    1 2 1 
		  1 2 3 2 1 
		1 2 3 4 3 2 1 
		  1 2 3 2 1 
		    1 2 1 
		      1 
		
		System.out.println("numbr diamound");
		int n = 4;

		// TOP
		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print(j + " ");
		    }

		    for(int j = i - 1; j >= 1; j--) {
		        System.out.print(j + " ");
		    }

		    System.out.println();
		}

		// BOTTOM
		for(int i = n - 1; i >= 1; i--) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print(j + " ");
		    }

		    for(int j = i - 1; j >= 1; j--) {
		        System.out.print(j + " ");
		    }

		    System.out.println();
		}
	*/
		
	/*
	  1 
    1 1 
  1 2 1 
1 3 3 1 
  1 2 1 
    1 1 
      1 	
		
		System.out.println("Pascal-like Diamond");
		int n = 4;

		// TOP
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
		// BOTTOM
		for(int i = n - 2; i >= 0; i--) {

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
		
		
		
	}

}
