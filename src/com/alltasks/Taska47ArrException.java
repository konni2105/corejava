package com.alltasks;

import java.util.Scanner;

public class Taska47ArrException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			System.out.println("enter index position of array");
			int pos = sc.nextInt();
			int a = arr[pos];
			System.out.println("enter String format");
			String s = sc.next();
			int b = Integer.parseInt(s);
			System.out.println(b / a);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Exception Doned");
		}
	}

}
