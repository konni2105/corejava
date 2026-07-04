package com.java8FeaturesStream;

import java.util.Arrays;

public class SumOfUniqueEle {

	public static void main(String[] args) {
		int[] arr= {1,6,7,8,1,1,8,8,7};//1+6+7+8=22
		
		int ans=Arrays.stream(arr)
		       .distinct()
		       .sum();
		System.out.println(ans);
		
		

	}

}
