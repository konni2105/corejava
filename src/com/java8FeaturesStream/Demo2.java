package com.java8FeaturesStream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Demo2 {

	public static void main(String[] args) {
		
		Set<String> cities=new HashSet<>();
		
		cities.add("vizag");
		cities.add("goa");
		cities.add("guntur");
		cities.add("ongole");
		cities.add("hyd");
		
		//cities.forEach(System.out::println);
		//cities.forEach(s->System.out.print(s +" "));
		
		Consumer<String> c= s -> {
			System.out.print(s +" ");
		};
		cities.forEach(c);
		
		
		
	}

}
