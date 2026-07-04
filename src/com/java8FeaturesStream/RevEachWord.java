package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RevEachWord {

	public static void main(String[] args) {
		String s="konni pavitra";
		
		String ans=Arrays.stream(s.split(" "))
				         .map(word-> new StringBuilder(word)
				         .reverse().toString())
				         .collect(Collectors.joining(" "));
		
		System.out.println(ans);
		

	}

}
