package com.alltasks;

public class Taska48StringWordSortbasednum {

	public static void main(String[] args) {
		String str = "going2 to3 institute4 iam1";
		String words[] = str.split(" ");
		String res[] = new String[words.length];
		for (String word : words) {
			int pos = 0;
			for (char ch : word.toCharArray()) {
				if (Character.isDigit(ch)) {
					pos = ch - '0';
				}
			}
			res[pos - 1] = word.replaceAll("\\d", "");

		}
		for (String s : res) {
			System.out.print(s + " ");
		}

	}
}
