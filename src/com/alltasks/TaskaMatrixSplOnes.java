package com.alltasks;

public class TaskaMatrixSplOnes {

	public static void main(String[] args) {
		int m[][] = { { 1, 0, 0}, { 0, 1, 0 }, { 0, 0, 1 } };
		int count = 0;
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[0].length; j++) {

				if (m[i][j] == 1) {
					int row = 0;
					int col = 0;

					// check row
					for (int r = 0; r < m[0].length; r++) {
						if (m[i][r] == 1)
							row++;
					}

					// check column
					for (int c = 0; c < m.length; c++) {
						if (m[c][j] == 1)
							col++;
					}

					if (row == 1 && col == 1) {
						count++;
					}
				}

			}

		}
		System.out.println("spl ones of matrix:"+count);
	}
}
