package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
   
	Arrays.stream(arr)
			// .mapToObj(x->x)  //converts int to Integer
	         .boxed()
	        .sorted(Collections.reverseOrder())
	        .forEach(System.out::println);
	}

}
