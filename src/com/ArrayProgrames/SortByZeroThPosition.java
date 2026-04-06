package com.ArrayProgrames;
/*
 indx 0   1  2  3
 ary={23,15,12,78}
 0/p:{ 12,23,15,78}
 -- look at last digit of each element
 --Find the smallest last digit
 --Move that element to index 0
 --Keep relative order of remaining elements same
23 → 3
15 → 5
12 → 2   ← smallest last digit
78 → 8

 ===================================
 indx variable --> store position
 ary variable i.e arr[0] --> store value
*/
public class SortByZeroThPosition {
	public static void main(String args[]) {
		int[] arr= {23,15,12,78};
		int minIndx=0;//store index ,not value
		//find indx of smallest ele
		for(int i=1;i<arr.length;i++) {
			if(arr[i]%10<arr[minIndx]) {
				minIndx=i;
			}
		}
		//store smallest value
		int minValue=arr[minIndx];
		
		// shift elements right
				for (int i = minIndx; i > 0; i--) {
					arr[i] = arr[i - 1];
				}
		//  place smallest at 0th position
				arr[0] = minValue;
				
		for(int n:arr) {
			System.out.println(n+" ");
		}
	}
}
