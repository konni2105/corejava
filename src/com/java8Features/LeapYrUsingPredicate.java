package com.java8Features;

import java.util.function.Predicate;
//year%100 -> not leap year
//year%4==0 -> leap year
public class LeapYrUsingPredicate {

	public static void main(String[] args) {
		
		int[] years= {2024,2025,2003,2004,2021,2000};
		Predicate<Integer> isLeap= year-> (year%4==0 && year%100 !=0) || (year %400==0);
		
		for(int year: years)
		System.out.println(isLeap.test(year));
	}

}
