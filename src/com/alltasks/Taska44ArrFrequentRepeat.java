package com.alltasks;

import java.util.Scanner;

public class Taska44ArrFrequentRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 2, 2, 3,3,4,6,5 };
		for (int i = 0; i < a.length; i++) {
			 
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					 
					System.out.print(a[i]+" ");
					 
				}
			}
			 
		}
	sc.close();}

}
