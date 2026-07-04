package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDupli {

	public static void main(String[] args) {
		 String s = "java is easy and java is powerful";

	        Set<String> set = new HashSet<>();

	        Arrays.stream(s.split(" "))
	                .filter(word -> !set.add(word))
	                .distinct()
	                .forEach(System.out::println);

	}

}
