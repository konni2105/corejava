package com.alltasks;
//burte force technique
//target value =sum of elements
import java.util.Scanner;

public class Taska44TargetEleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter target value");
	    int target = sc.nextInt();
		int[] arr = { 1, 3, 7, 8, 2, 7, 3, 8, 2 };
	     
	    boolean[] b = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (b[i]) {
				continue;
			}
			int jnum=0;
			boolean match=false;
			for (int j = i + 1; j < arr.length; j++) {

				if (!b[j] && arr[i] + arr[j] == target) {
					jnum=arr[j];
					match=true;
					b[i] =true;
					b[j] = true;

				}

			}
			
			if(match) {
				System.out.println(arr[i] + " " +jnum );
			}

		}

		sc.close();
	}

}
