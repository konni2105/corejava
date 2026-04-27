package com.alltasks;

public class Taska45DiamondPattern {

	public static void main(String[] args) {
		  for(int i=1;i<=6;i++) {
			  //spaces
			  for(int j=6;j>i;j--) {
				  System.out.print(" ");
			  }
			  // stars
			  for(int k=1;k<=i;k++) {
				  System.out.print("* ");
				 // System.out.print("*");
			  }
			  System.out.println();
		  }
		  for(int i=1;i<6;i++) {
			  //spaces
			  for(int j=1;j<i;j++) {
				  System.out.print(" ");
			  }
			  // stars
			  for(int k=5;k>=i;k--) {
				  System.out.print(" *");
				  //System.out.print("*");
			  }
			  System.out.println();
		  }

	}

}
