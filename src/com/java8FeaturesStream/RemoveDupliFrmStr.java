package com.java8FeaturesStream;

import java.util.Arrays;

public class RemoveDupliFrmStr {

	public static void main(String[] args) {
		String s="dabcadefg";
		
		Arrays.stream(s.split("")).distinct().forEach(System.out::println);
		//s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::println);
	}

}
