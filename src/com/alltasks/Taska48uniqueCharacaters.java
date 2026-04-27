package com.alltasks;

public class Taska48uniqueCharacaters{

	public static void main(String[] args) {
		String str = "Programming";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(str.charAt(i));
			}
			 
		}
	}

}
