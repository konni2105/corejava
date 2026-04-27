package com.alltasks;

//even rows->reverse
//odd rows->*2
//diagonal ele square
public class Taska44_2DArray {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, 
				        { 4, 5, 6 },
				        { 7, 8, 9 } 
				                    };
		for (int i = 0; i < arr.length; i++) {

			// System.out.print(arr[i][j]+" ");

			if (i % 2 == 0) {
				// even rows:first row start=0(i=0),end=i.length(i=2)
				int start = 0;
				int end = arr[i].length - 1;
				while (start < end) {
					int t = arr[i][start];
					arr[i][start] = arr[i][end];
					arr[i][end] = t;
					start++;
					end--;
				}
			}

			// odd rows:*2
				for (int j = 0; j < arr[i].length; j++) {
					if (i % 2 != 0 && i!=j) {
					arr[i][j] *= 2;
				}
			}

           //digonal :square
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j ) {
					arr[i][j] *= arr[i][j];
				}
			}

		}

		for (int a[] : arr) {
			for (int a1 : a) {
				System.out.print(a1 + " ");
			}
			System.out.println();

		}

	}
}
