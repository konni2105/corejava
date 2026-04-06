package com.ArrayProgrames;
/*We compare two adjacent elements
👉 Swap them if they are in the wrong order
👉 Repeat until the array is sorted */
public class BubleSort {

	public static void main(String[] args) {
		//ary intializtn
		int[] arr = {10,40,60,30,20};//index 0 1 2 3 4 
		int temp=0;//used swap 2 numbrs
		System.out.println("array ele length:"+arr.length);//5
       
		//i-> counts passes & If array length = 5 → passes = 4
		//-1 --> last ele auto sorted
		for(int i=0;i<arr.length-1;i++) {
			//Compares adjacent elements
			// -i bcz last ele are alrdy sorted
    	  for(int j=0;j<arr.length-1-i;j++) {
    		  if(arr[j]>arr[j+1]) {
    			  temp=arr[j];
    			  arr[j]=arr[j+1];
    			  arr[j+1]=temp;
    		  }
    	  }
       }
		System.out.println("prints sorted array:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
