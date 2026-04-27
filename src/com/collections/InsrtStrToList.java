package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsrtStrToList {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();

//	l.add("python");
//	l.add("c");
//	l.add("c++");
//	l.add("python");

		Scanner s = new Scanner(System.in);
		System.out.println("enter list size:");
		int size=s.nextInt();
		System.out.println("enter list items:");
		for (int i = 0; i <size; i++) {
			
			String str=s.next();
			l.add(str);
		}
		System.out.println("original list:" + l);

		for (int i = 0; i < l.size(); i++) {

			if (l.get(i).equalsIgnoreCase("python")) {

				l.add(i + 1, "java"); // l.add(l.set(i+1, "java"));
				i++;
			}
		}
		System.out.println(l);
	}
}
