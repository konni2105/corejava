package com.java8FeaturesStream;

import java.util.Arrays;

public class SpecifiedNumOfVowels {

	public static void main(String[] args) {
		
		String s="i am learning streams in java";
		
		Arrays.stream(s.split(" "))
		 	.filter(x-> x.replaceAll("[aeiou]","").length()==2)
		 	.forEach(System.out::println);
		      
	}

}
