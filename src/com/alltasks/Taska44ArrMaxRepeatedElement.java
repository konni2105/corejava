package com.alltasks;

public class Taska44ArrMaxRepeatedElement {

	public static void main(String[] args) {
		 int [] arr= {1,3,2,9,1,2,1,1,2};
		 int n=arr.length;
		 int maxcount=0;
		 int maxEle=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 int count=1;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
			 count++;
			  }
			 
		 } 
		 if (count > maxcount) {
             maxcount = count;
             maxEle = arr[i];
         }
		 }
		 System.out.println(maxEle);
		 }
		   
	}


