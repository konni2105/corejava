package com.ArrayProgrames;

public class DupliRemv {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,4,5};
		System.out.println("unique elements in ary");
		for(int i=0;i<arr.length;i++) {
			boolean isDupli=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDupli=true;
					break;
				}
			}
			if(!isDupli) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println("even numbers");
		for(int i=0;i<arr.length;i++) {
			boolean isDupli=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDupli=true;
					break;
				}
			}
			if(!isDupli) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]+" ");
				}
			}
		}
		System.out.println("even numbers");
		for(int i=0;i<arr.length;i++) {
			boolean isDupli=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDupli=true;
					break;
				}
			}
			if(!isDupli) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]+" ");
				}
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]+" ");
//			}
//		}
		
		System.out.println("odd numbers");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" ");
			}
		}
		
		System.out.println("prime numbers");
		for(int i=0;i<arr.length;i++) {
			boolean status =true;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					System.out.println(arr[i]+" ");
					status=false;
					break;
				}
				if(status) {
					System.out.println(arr[i]+" ");
				}
			}
			
		}
		

	}

}
