 package com.alltasks;

public class TaskaArrMaxSubarrayelement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 0, 2, 3, 4, 5, 9, 6, 7, 8, 9, 10 };
		int left=0;
		int max=0;
		int start=0,end=0;
		for(int right = 1;right<arr.length;right++) { 
		while(right<arr.length && arr[right-1]+1==arr[right]) {
			
			right++;
		}
			if(max<(right-left)) {
			max=right-left;
			start=left;
			end=right-1;
		}
		left=right;
		}
	for(int i=start;i<=end;i++) {
		
		System.out.print(arr[i]+" ");
	}

	
}}