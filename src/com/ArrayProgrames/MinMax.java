package com.ArrayProgrames;

public class MinMax {

	public static void main(String[] args) {
		int[] arr= {10,20,60,7,93,90};
		
		int max=arr[0];
		int min=arr[0];
		
		int secMax=arr[0];
		int secMin=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secMin=min;
				min=arr[i];
				
			}else if(arr[i]<secMin && arr[i]!=min) {
				secMin=arr[i];
			}
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
			}else if(arr[i]>secMax && arr[i]!=max) {
				secMax=arr[i];
			}
			
		}
		System.out.println("min ele:"+min);
		System.out.println("max ele:"+max);
		System.out.println("secMin ele:"+secMin);
		System.out.println("secMax ele:"+secMax);
	}
}
