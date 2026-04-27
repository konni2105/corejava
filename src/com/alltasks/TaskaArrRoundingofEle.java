package com.alltasks;

public class TaskaArrRoundingofEle {

	public static void main(String[] args) {
		// = {"92","86","99","18","36","41","45"};
		int arr[] = {95,86,99,11,18,40,41,45,67};
		 for(int i=0;i<arr.length;i++) {
			  int n=arr[i];
			  int r=n%10;
			  if(r<5) {
				  arr[i]=arr[i]-r;
			  }
			  if(r>5) {
				  arr[i]=arr[i]+(10-r); 
			  }
			 }
		 for(int i=0;i<arr.length;i++) {

		 System.out.print(arr[i]+" ");
		 }
		 }
	}


