package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.Comparator;

public class HighestWordLength {

	public static void main(String[] args) {
		String s="iam learning Streams API  in java";
		
		String ans=Arrays.stream(s.split(" "))
			             .max(Comparator.comparing(String::length))
			             .orElse(" no words found ");
		System.out.println(ans);
	}

}
