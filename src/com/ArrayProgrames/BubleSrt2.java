package com.ArrayProgrames;
//taking sorted ary
public class BubleSrt2 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int count=0;
		int count1=0;
		System.out.println("array ele length"+arr.length);
		for(int i=0;i<arr.length-1;i++) {
			boolean status=false;//no swap happened yet
			System.out.println("array count:"+count++);
			for(int j=0;j<arr.length-1-i;j++) {
				System.out.println("array count1:"+count1++);
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					status=true;//at least one swap happens
				 }
			}
			if(!status) {
				break;
			}
		}
	
	for(int a:arr) {
		System.out.print(a+" ");
	}
 }
}