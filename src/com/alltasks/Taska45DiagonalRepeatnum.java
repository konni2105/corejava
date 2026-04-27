package com.alltasks;
//               1              1
//                   2      2
//                       3
//                    2     2
//               1              1

public class Taska45DiagonalRepeatnum {
	public static void main(String[] args) {
		 int n=5;
		 int mid=n/2;
		 for(int i=1 ;i<=n;i++) {
			 for(int j=1 ;j<=n;j++) {
				 if((i==j || j==n+1-i) && i<=mid) {
					 System.out.print(i+" ");
				 }
				 else if((i==j || j==n-i+1) && i>mid) {
					 //System.out.print(n-i+1 + " ");
					 System.out.print(n+1-i + " ");
				 }
				 else
				 {System.out.print("  "); }
				 
				 }
			 System.out.println();
			 
			 }
	}

}
