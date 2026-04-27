package com.alltasks;

public class Taska44ArrHistrogram {

	public static void main(String[] args) {
     	int[] h = { 2, 3, 1, 5, 7, 8, 4 };
//		int[] h = { 2, 1, 5, 6, 2,3 };
		int e = h.length;
		int max_area = 0;
		int rectcount = 0;

		for (int i = 0; i < e; i++) {
			int count = 1;
			// left check
			int left = i - 1;
			while (left >= 0 && h[left] >= h[i]) {
				count++;
				left--;
			}
			// right check
			int right = i + 1;
			while (right < e && h[right] >= h[i]) {
				count++;
				right++;
			}

			rectcount += (count);
			int area = h[i] * count;
			if (area > max_area) {
				max_area = area;

			}
		}
		System.out.println(max_area);
		System.out.println(rectcount);
	}

}
