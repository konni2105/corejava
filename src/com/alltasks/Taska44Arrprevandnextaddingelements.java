package com.alltasks;

public class Taska44Arrprevandnextaddingelements {

	public static void main(String[] args) {
		 int [] arr= {10,20,30,40,50,60}; 
		 int [] res= new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			  if(i==0) {
				  res[i]=arr[i]+arr[i+1];
			  }
			  else if(i==arr.length-1) {
				  res[i]=arr[i]+arr[i-1];
			  }
			  else {
				  res[i]=arr[i+1]+arr[i-1];
			  }
			 
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(res[i]+" ");
		 }

	}

}
