package com.ArrayProgrames;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr= {1,0,3,0,5};//arr creation
		MoveZerosToEnd(arr);// arr passed to method
		for(int num:arr) {
			System.out.println(num+" ");//print modified array
		}
	}
	public static void MoveZerosToEnd (int[] arr) {
		int nonZeroIndex=0;//points next nonzero ele position 
		//i scan every ele
		for(int i=0;i<arr.length;i++) {
			//ignore 0's
			if(arr[i]!=0) {
				/* when we find nonzero ele 
				  we have to swap it with next nonzero ele
				 */
				int temp=arr[nonZeroIndex];
				arr[nonZeroIndex]=arr[i];
				arr[i]=temp;
				nonZeroIndex++;
			}
		}
		
	}
}
/*"with out using index" 
 
 
 
 
 */
