package com.ArrayProgrames;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {4,3,2,1};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			int minIndx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndx]) {
					minIndx=j;
					}
				}
			temp=arr[i];
			arr[i]=arr[minIndx];
			arr[minIndx]=temp;
			}
		System.out.println("Selection sort");
		for(int n:arr) {
			System.out.println(n+" ");
		}
	}
}
