package com.ArrayProgrames;

import java.util.Scanner;

/* ary=1 2 3 4 5 6 7 8
 * 4times ary rotation
 --2 3 4 5 6 7 8 1
 --3 4 5 6 7 8 1 2
 --4 5 6 7 8 1 2 3
 --5 6 7 8 1 2 3 4
 1) reverse the ary
 2) revrse first half ary
 3) revrse second half ary
 **/
public class RotationlAry {
	static void revAry(int arr[],int start,int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void rotnlAry(int arr[],int r) {
		int start=0;
		int end=arr.length-1;
		revAry(arr,start,end);//rev given ary
		revAry(arr,start,r-1);//rev 1st half ary
		revAry(arr,r,end);//rev 2nd half ary
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("how many times array will be rotate");
		int r=s.nextInt();
		
		int[] arr= {1,2,3,4,5,6,7,8};
		rotnlAry(arr,r);
		System.out.println("after revrse:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
