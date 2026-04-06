package com.ArrayProgrames;

import java.util.Scanner;

/* if any ele in matrix is 0 ,convert its entire row and cloumn to  0
 input  110  output  000
        111          010
        011          000
 * */
public class MatrixRwClmZero {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter numbr of rows");
		int row=s.nextInt();
		System.out.println("enter numbr of columns");
		int column=s.nextInt();
		int[][] arr=new int[row][column];
		
		System.out.println("entr matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		/*int [][] arr= {
				{1,1,0},
				{1,1,1},
				{0,1,1} };*/
		//int row=arr.length;//0 1 2
		//int column=arr[0].length;
		
		
		//bool ary to remember which rows and columns must be zero
		boolean[] rowZero=new boolean[row];
		boolean[] clmZero=new boolean[column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(arr[i][j]==0) {
					rowZero[i]=true;//this must be zero
					clmZero[j]=true;//this must be zero
				}
			}
		}
		//setting row zero
		for(int i=0;i<row;i++) {
			if(rowZero[i]) {
				for(int j=0;j<column;j++) {
					arr[i][j]=0;
				}
			}
		}
		//setting column zero
		for(int j=0;j<column;j++) {
			if(clmZero[j]) {
				for(int i=0;i<row;i++) {
					arr[i][j]=0;
				}
			}
		}
		//result
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}


