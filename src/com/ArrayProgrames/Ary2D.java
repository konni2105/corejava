package com.ArrayProgrames;

import java.util.Scanner;

//2D ary-> rprsnt rows and column
/* 00 01 02
   10 11 12
 */
public class Ary2D {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//String[][] n=new String[2][3];
		int[][] arr=new int[2][3];//2 rows ,3 columns ->6 positions
		System.out.println(arr.length);// lenth 2 so index 0 1 2 --> 00 01 02
		                                         // 10 11 12
		System.out.println(arr[0].length);//3 clmns
		System.out.println(arr[1].length);//3clms
		//using foreach
		  for(int[]n1:arr){//storing 2d ary in 1d ary
			  for(int n:n1){//storing 1d ary in normal varible 
				 System.out.print(n+" "); 
			  }
	         System.out.println();
		  }
		
		
		
		/*System.out.println("enter values for 2d array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j< arr[i].length;j++) {
				arr[i][j]=s.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
	}

}
/*public class Ary2D {

	public static void main(String[] args) {
		int[][] arr=new int[2][3];//2 rows ,3 columns ->6 positions
		System.out.println(arr.length);// lenth 2 so index 0 1 2 --> 00 01 02
		                                         // 10 11 12
		System.out.println(arr[0].length);//3 clmns
		System.out.println(arr[1].length);//3clms
		
		//2d ary represntn
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j< arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}*/
