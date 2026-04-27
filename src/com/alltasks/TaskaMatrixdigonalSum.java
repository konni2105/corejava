package com.alltasks;

public class TaskaMatrixdigonalSum {

	public static void main(String[] args) {
		int m[][] = { { 1, 2, 5 }, { 4, 1, 6 }, { 2, 8, 1 } };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (i==j ) {
					sum += m[i][j];
				}
				if (j == m.length -i -1) {
					sum1 += m[i][j];
				}
			}

		}
		System.out.println("left diagonal sum:" + sum);
		System.out.println("right diagonal sum:" + sum1);
	}

}
