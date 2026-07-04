package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//{streams=1, java=2, learning=1, simple=1, in=1, API=1, am=1, i=1, is=1}
public class OccurancesOfEachWord {

	public static void main(String[] args) {
		String s="java is simple,i am learning streams API in java ";
		
		Map<String , Long > ans =Arrays.stream(s.split(""))
		                               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));   //Function.identity() or x->x
		
		System.out.println(ans);
	}

}
