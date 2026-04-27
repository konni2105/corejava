package com.alltasks;
//input {1,2,3,4}
//output {24,12,8,6}
//constraints 2*3*4=24(except its index value)
public class TaskaArrProductExceptSelf {

	public static void main(String[] args) {
		 int arr[]= {2,2,3,4};
		 int res[]=new int[arr.length];
		  
		  for(int i=0;i<arr.length;i++) {
			  int k=1;
			  for(int j=0;j<arr.length;j++) {
				  if(i==j) continue;
				   k=k*arr[j]; 
			  }
			  res[i]=k;
			   
		  }
		  for(int n:res) {
			  System.out.print(n+" ");
		  }
		  
	}

}
