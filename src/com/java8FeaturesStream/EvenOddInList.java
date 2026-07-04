package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddInList {

	public static void main(String[] args) {
	int[] arr= {2,3,4,5,6,8};
	
	Map< Boolean,List<Integer>>l=Arrays.stream(arr)
						.boxed()
			             .collect(Collectors.groupingBy(x->x%2==0));
	
			System.out.println("even num:"+ l.get(true));

			System.out.println("odd num:"+ l.get(false));
	
	}

}
