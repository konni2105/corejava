package com.alltasks;

public class TaskaStringvowelConstants {

	public static void main(String[] args) {
		String str = "festival";
		String v = "aeiou";
		String vowels = "";
		String con = "";
		for (int i = 0; i < str.length(); i++) {
			if (v.indexOf(str.charAt(i)) == -1) {
				con = con + str.charAt(i);
			} else {
				vowels = vowels + str.charAt(i);
				 
			}

		}
		System.out.println(str.length());
		System.out.println(vowels);
		System.out.println(con);
	}

}
