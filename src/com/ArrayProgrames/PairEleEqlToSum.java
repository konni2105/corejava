package com.ArrayProgrames;

import java.util.Scanner;

/*find the pair of elements whose sum is equal to a given number.
 input array
       arr = {2, 4, 6, 8, 10}
       targetSum = 12
 Output:
      Pairs:
      2 + 10 = 12
      4 + 8 = 12
       */
public class PairEleEqlToSum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter arr size");
		int size= s.nextInt();
		int[] arr = new int[size]; 
		
	
		System.out.println("enter arr ele");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("target sum");
		int target=s.nextInt();
		System.out.println("pairs of ele");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + target);
				}
			}
		}

	}

}
