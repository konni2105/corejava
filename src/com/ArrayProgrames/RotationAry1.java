package com.ArrayProgrames;

import java.util.Scanner;

/*Rotate the array left by 1 position

Input:  10, 20, 30, 40, 50
Output: 20 30 40 50 10 
*/
public class RotationAry1 {
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
	static void rotatnlAry(int arr[],int rotation) {
		
		int start=0;
		int end=arr.length-1;
		int n=arr.length;
		rotation=rotation % n;//if  rotation >arr size
		revAry(arr,start,rotation-1);//rev 1st half(r) ary
		revAry(arr,rotation,end);//rev 2nd half(remaing) ary
		revAry(arr,start,end);//rev given ary
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("how many time ary will rotate");
		int rotation=s.nextInt();
		int[] arr= {10, 20, 30, 40, 50};

		System.out.println("after rotation:");
		rotatnlAry(arr,rotation);
		for(int a:arr) {
			System.out.println(a+" ");
		}
	}

}
