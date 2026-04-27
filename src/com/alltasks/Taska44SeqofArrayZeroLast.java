package com.alltasks;

import java.util.Scanner;

//input {1,0,3,0,5}
//output {1,3,5,0,0 }
public class Taska44SeqofArrayZeroLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter array elements of size 5");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] res = new int[5];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				res[index] = arr[i];
				 index++;
			}
		}
        //other zeros logic res[index]=1;
		while (index < arr.length) {
			res[index] = 0;
			index++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(res[i] + " ");

		}

		sc.close();
	}

}
