package com.java8Features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class Demo8 {

	public static void main(String[] args) {
		
		IntPredicate i=i1-> i1>100;
		System.out.println(i.test(150));//true
		
		BiPredicate<Integer , Integer> b1=(i1,i2)-> i1*i2 >100;
		System.out.println(b1.test(15, 20));//true
		System.out.println(b1.test(2,3));//false
		
		BiFunction<String,String,String> b2=(s1,s2)-> s1.concat(s2).toUpperCase();
		System.out.println(b2.apply("java is" , "simple"));
		
		BiConsumer<Integer,String>b3=(age , name)-> {
			System.out.println("std age:"+age);
			System.out.println("std name:"+name);
		};
		b3.accept(18,"tom");
	}

}
