package com.patterns;

public class Pyramid {

	public static void main(String[] args) {
		
		/*
Pattern Type	Formula
Triangle	     j ≤ i
Inverted	     j ≤ n - i + 1
Pyramid	         2*i - 1
Spaces	         n - i                   */
		
		
		
		
		
/*		
		    *
		   ***
		  *****
		 *******
		*********
		System.out.println("fullpyramid");
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
*/
		
/*		 
		        * 
		      * * 
		    * * * 
		  * * * * 
		* * * * * 
		
		
		System.out.println("halfpyramid");
		int n=5;
		

		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }

		    System.out.println();
		}
*/
		
		
/*		  * * * * * * * * * 
		    * * * * * * * 
		      * * * * * 
		        * * * 
		          * 
		System.out.println("inverted pyramid");
		int n=5;
		

		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <=i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= 2*(n-i)+1; j++) {
		        System.out.print("* ");
		    }

		    System.out.println();
		}
*/

/*		        1 
		      1 2 1 
		    1 2 3 2 1 
		  1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1 
		
		System.out.println("num pyramid");
		int n=5;
		

		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= i; j++) {
		        System.out.print(j+" ");
		    }

		    for(int j =i-1; j>=1 ; j--) {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
*/
 /*     A
      A B A
    A B C B A
  A B C D C B A */
		
		System.out.println("alpha pyramid");
		int n=5;
		

		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }
		    //increase
		    for(int j = 0; j < i; j++) {
		        System.out.print((char)(65+j)+" ");
		    }
		  //decrease
		    for(int j =1-2; j >=0; j--) {
		        System.out.print((char)(65+j)+" ");
		    }

		   
		    System.out.println();
		}
		
	}

}
