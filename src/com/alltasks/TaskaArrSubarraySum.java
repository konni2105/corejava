package com.alltasks;

public class TaskaArrSubarraySum {

	public static void main(String[] args) {
		//int arr[] = { -1, -3, -4, -1, 2, -1, 6, 2, -5, 4 };
		int arr[] = {-1};
		int max = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > max) {
					max = sum;
					start = i;
					end = j;
				}
			}

		}
		System.out.println(max);
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]+" ");

		}

	}

}
