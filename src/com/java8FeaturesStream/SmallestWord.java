package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.Comparator;

public class SmallestWord {

	public static void main(String[] args) {
		 String s = "iam learning Streams API in java";

	        String ans = Arrays.stream(s.split(" "))
	                .min(Comparator.comparing(String::length))
	                .orElse("");

	        System.out.println(ans);
	}

}
