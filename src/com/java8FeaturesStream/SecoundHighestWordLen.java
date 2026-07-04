package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.Comparator;

public class SecoundHighestWordLen {

	public static void main(String[] args) {
		String s="iam learning Streams API  in java";
		
		String ans = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length)
                .reversed())
                .skip(1)
                .findFirst()
                .orElse("No second highest");
			System.out.println(ans);

	}

}
