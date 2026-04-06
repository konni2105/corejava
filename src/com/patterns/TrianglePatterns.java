package com.patterns;

public class TrianglePatterns {

	public static void main(String[] args) {
		
		/*
		  Every triangle pattern follows:
		                  columns = i   OR   columns = n - i
                          Right alignment = add spaces before printing
        */
		
		
/*	    *
		**
		***
		****
		*****
		
	System.out.println("LeftTri");
		int n=5;
		for(int i=1;i<=n;i++) {  //rows=n
			for(int j=1;j<=i;j++) {   //clm=i(increasing)
				System.out.print("*");
			}
			System.out.println();
		}
*/
		
		
/*		    *
		   **
		  ***
		 ****
		*****
		
		
  		System.out.println("RightTri");
		int n=5;
		for(int i=1;i<=n;i++) {  //rows=n
			//for spacing	
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
				}
		
			for(int j=1;j<=i;j++) {   //clm=i(increasing)
				System.out.print("*");
			}
			System.out.println();
		}
*/
		
/*		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		
		System.out.println("num increasing tri");
		int  n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
*/
		
/*		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 
		
		 System.out.println("num decreasing tri");
		int  n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		} 
*/
		
/*		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
		
		
		System.out.println("continuous number triangle");
		int  n=5;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
*/
	/*	A 
		A B 
		A B C 
		A B C D 
		A B C D E 
		
		System.out.println("Alphabet tri");
		int  n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(65+j-1)+" ");
			}
			System.out.println();
		} */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
