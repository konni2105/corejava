package com.alltasks;

public class Taska44ArrJumpsBasedEle {

	public static void main(String[] args) {
		int[] arr = { 0,1,2,1,0,-2,1};
		int jcount = 0;
		int j = arr.length;
		//int i=0;
		int s=0;
         
		 while(s<j) {
			 s=arr[s]+s;
			if (arr[s] == 0) {
				System.out.println("iam stuck!!");
				break;
			} else if (arr[arr[s]+s]+arr[s]==0) {
				//2+2=4(-2)+( 2)==0
				System.out.println("inifinity loop");
				break;
			}

			else if (arr[s] > j) {
				System.out.println("out of bound");
				break;
			} 
			 
			jcount++;

		}

		System.out.println(jcount);

	}
}
