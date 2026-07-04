package com.ArrayProgrames;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class RevAry {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println("Original Array: "+Arrays.toString(arr));
//		 System.out.print("array reverse: ");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		//using while
		int arrLen=arr.length;
		int start=0;
		int end=arrLen-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		
		start++;
		end--;
		}
		System.out.println("Reverse Array"+Arrays.toString(arr));
		
		//conert to list
		List<Integer>res=new ArrayList<>();
		for(int num:arr) {
			res.add(num);
		}
		System.out.println("RevArraylist:"+res);
		
	}

}
