package com.alltasks;

public class Taska44ArrEleCountAddEleAtLast {

	public static void main(String[] args) {
		System.out.println("hello");
		int arr[] = { 10110,01, 12, 133, 15, 2,78 };

		for (int n = 0; n < arr.length; n++) {
			int count = 0;
			int t = arr[n];
			 
			 
			while (t != 0) {
				t = t / 10;
				count++;
			}
			
			arr[n] = arr[n] * 10 + count;
			System.out.print(arr[n] + " ");
		}

		System.out.println();
		// logic-2 String concat
		for (int x : arr) {
			
	    System.out.print(x+" ");
		}

	}

}
