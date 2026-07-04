package com.java8FeaturesStream;

import java.util.Arrays;

public class CountVowelsInEachWord {

	public static void main(String[] args) {
		String s="java streams api";
		Arrays.stream(s.split(" "))
              .forEach(word -> {
            	  
            	  long count= word.toLowerCase()
            			          .chars()
            			          .filter(ch ->"aeiou".indexOf(ch)!=-1)
            			          .count();
            	  System.out.println(word +" -->"+count);
            	  
            	  
              });
	}

}
