package com.ArrayProgrames;

import java.util.Scanner;

public class PrimeNmbrs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enetr size");
		int size=s.nextInt();
		int[] arr=new int[size];
		System.out.println("entr elements");
		for(int i=0;i<size; i++) {
			arr[i]=s.nextInt();//Read Elements into Array stored in arr[i]
		}
		System.out.println("prime nmbrs in array");
		//arr.length-->total numbr of elements i.e index:start=0 & end=n-1
		for(int i=0;i<arr.length;i++) {
			boolean status=true;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					status=false;
					break;
				}
			}
			if(status) {
				System.out.println(arr[i]+" ");
			}
		}
	}
}
