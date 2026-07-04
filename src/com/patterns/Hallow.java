package com.patterns;

public class Hallow {

	public static void main(String[] args) {
		
		/*Print * only when:
		              i == 1 || i == n || j == 1 || j == n   
		              else ....print space   */
		
		
/*		
		* * * * * 
		*       * 
		*       * 
		*       * 
		* * * * * 
		
		System.err.println("hollow sqr");
		int n=5;
		for(int i = 1; i <= n; i++) {
		    for(int j = 1; j <= n; j++) {
		    	 if(i == 1 || i == n || j == 1 || j == n) {
		             System.out.print("* ");
		         } else {
		             System.out.print("  ");
		         }
		     }
		     System.out.println();
		 }	
*/

/*
 
 		
* * * * * * 
*         * 
*         * 
* * * * * *         
		
		System.err.println("hollow rectangle");
		int rows=4;
		int cols=6;
		for(int i = 1; i <= rows; i++) {
		    for(int j = 1; j <= cols; j++) {
		    	 if(i == 1 || i == rows || j == 1 || j == cols) {
		             System.out.print("* ");
		         } else {
		             System.out.print("  ");
		         }
		     }
		     System.out.println();
		 }	
*/
		
		
/*		
		*
		* *
		*   *
		*     *
		* * * * *
		System.err.println("hollow triangle");
		int n = 5;

		for(int i = 1; i <= n; i++) {
		    for(int j = 1; j <= i; j++) {

		        if(i == 1 || i == n || j == 1 || j == i) {
		            System.out.print("* ");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
*/
	
/*
        *
      *   *
    *       *
  *           *
* * * * * * * * *		
		
		System.err.println("hollow pyramid");
		int n = 5;
		
		for(int i = 1; i <= n; i++) {

		    for(int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		    }

		    for(int j = 1; j <= 2*i - 1; j++) {

		        if(i == 1 || i == n || j == 1 || j == 2*i - 1) {
		            System.out.print("* ");
		        } else {
		            System.out.print("  ");
		        }
		    }

		    System.out.println();
		}
		
*/		
		
/*		
        *
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *
        system.out.println("halloow dimnd");
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

		// BOTTOM
		for(int i = n - 1; i >= 1; i--) {

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
*/
	}

}
