package com.alltasks;

public class TaskaArrAddingArrEleAddlast {

	public static void main(String[] args) {
		int arr[] = { 12, 345, 67678, 123, 32 };
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int n = arr[i];
			while (n != 0) {
				int r = n % 10;
				n /= 10;
				sum += r;
			}
			 String  s=String.valueOf(sum);
			System.out.print(arr[i]+s+" ");
		}
	}

}
 