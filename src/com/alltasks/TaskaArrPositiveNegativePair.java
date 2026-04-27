package com.alltasks;

public class TaskaArrPositiveNegativePair {

	public static void main(String[] args) {
		int arr[] = { 1,3, 2, 4, 5, -1, -2, -3, -4, 6, 7 };
		int matched[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = i + 1; j < arr.length-1; j++) {
				if (arr[i] == -arr[j]) {
					matched[i] =arr[i]; 
					System.out.println("Matched: "+ arr[i] + "  " + arr[j] + " ");
					found = true;
					break;
				}
			}
			boolean flag = true;
			if (!found){
				for(int k=0;k<matched.length-1;k++) {
					if(matched[k] == arr[i] || matched[k] == -arr[i] ) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.print(" "+arr[i]);
				}
			}
			 
		}

	}

}
