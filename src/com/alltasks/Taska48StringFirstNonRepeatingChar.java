package com.alltasks;
import java.util.Scanner;

public class Taska48StringFirstNonRepeatingChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(str.charAt(i));
				System.out.println("***************");
				break;
			}
			else {
				System.out.println("no repeating character");
			}
			if (count == 1) {
				System.out.println("FirstNonRepeatingChar:"+str.charAt(i));
			}
		}

	sc.close();}

}
