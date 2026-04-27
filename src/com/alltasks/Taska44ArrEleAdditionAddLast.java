package com.alltasks;

public class Taska44ArrEleAdditionAddLast {

	public static void main(String[] args) {
		 int arr[]= {123,45,78,98,17};
		 
		 for(int i=0;i<arr.length;i++) {
			 int sum=0; 
			 int n=arr[i];
			 while(n!=0) {
				 int r=n%10;
				 n/=10;
				 sum+=r; 
			 } 
			// System.out.print(sum+" ");
			 if(sum<10) {
			 arr[i]=arr[i]*10+sum;
			 System.out.print(arr[i]+" ");}
			 else {
				 arr[i]=arr[i]*100+sum;
				 System.out.print(arr[i]+" ");
			 }
		 }
		 

	}

}
