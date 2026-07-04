package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class OccurancesOfEachChar {

	public static void main(String[] args) {
		String s="Mississippi";
	
		Map<String,Long> m=Arrays.stream(s.split(""))
				                 .collect(Collectors.groupingBy(x->x,Collectors.counting()));
		     System.out.println(m);
		
			
	}

}
