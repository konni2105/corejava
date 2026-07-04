package com.java8Features;

import java.util.function.Predicate;

public class Demo3 {

	public static void main(String[] args) {
		
		String[] names= {"abhi","tom","jerry","benten"};
		
		Predicate<String> p= (s)->s.length()>5;
		Predicate<String> p1= (s)->s.toLowerCase().contains("e");
		Predicate<String> p2= (s)->s.contains("t");
		
		for(String nm:names) {
			if(p2.test(nm)&& p1.test(nm) && p.test(nm)) {
			System.out.println(nm);
			}
		}
		
		System.out.println("**********");
		for(String nm:names) {
			if(p.or (p1).or(p2).negate().test(nm)) {
			System.out.println(nm);
			}
		}
		

	}

}
