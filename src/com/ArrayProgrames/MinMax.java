package com.ArrayProgrames;

public class MinMax {

	public static void main(String[] args) {
		int[] arr= {8,4,6,2,54};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min nmbr in array"+min);
		System.out.println("max nmbr in array"+max);
	}

}
