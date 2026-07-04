package com.programs;

import java.util.Arrays;

//find min element and place it at correct position
//smallest ele index ni minIndex lo store chesi,inner loop complete ieyyaka swap chestam
public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr= {5,3,8,4,2};
		
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
   