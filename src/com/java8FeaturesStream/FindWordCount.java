package com.java8FeaturesStream;

import java.util.Arrays;

public class FindWordCount {

	public static void main(String[] args) {
		String s = "iam learning Streams API in java";

        long count = Arrays.stream(s.split(" "))
                .count();

        System.out.println(count);
	}

}
