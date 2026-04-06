package com.patterns;

public class InvertedTri {

	public static void main(String[] args) {
		
		/*
		-Rows decrease OR
		-Inner loop runs in reverse
		
*Pattern Type	Formula
Normal	j ≤ i       
Inverted	j ≤ n - i + 1


increasing:
for(int i = 1; i <= n; i++)

Decreasing:
for(int i = n; i >= 1; i--) */
		
		
/*		*****
		****
		***
		**
		*
		System.out.println("inverted star triangle");
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
/*
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 

		System.out.println("inverted numbr triangle");
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
*/
/*		A B C D E 
		A B C D 
		A B C 
		A B 
		A 
		
		
		System.out.println("rev alphabt triangle");
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(65+j-1)+" ");
			}
			System.out.println();
		}
		
*/		
		
	/*	*****
		 ****
		  ***
		   **
		    *
		
		 System.out.println("aligned-right invrt triangle");//Spaces increase (i grows)
		                                                   //Stars decrease (n - i + 1)
		int n=5;
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
		
	}

}
