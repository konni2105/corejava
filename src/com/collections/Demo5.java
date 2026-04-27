package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo5 {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<>();
		c.add(10);

		Collection<Integer> c1=new ArrayList<>();
		c1.add(10);
		System.out.println(c.equals(c1));//true
		
		System.out.println(c.hashCode());//41 --> hashCode=31*1+10
		System.out.println(c1.hashCode());//41
		
		Collection<String> c2=new ArrayList<>();
		c2.add("A");
		System.out.println(c2.hashCode());//96(ascii)
		
		Collection<String> c3=new ArrayList<>();
		c3.add(null);
		System.out.println(c3.hashCode());//31(ascii)
		
	}
	

}
