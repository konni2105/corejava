package com.java8Features;

import java.util.function.Consumer;
import java.util.function.Function;

class Movie{
	String name;
	public Movie(String name) {
		super();
		this.name=name;
	}
}

public class Demo6 {

	public static void main(String[] args) {
		
		Consumer<Movie> c1=(m)-> {
		System.out.println(m.name );
		System.out.println("movie intro");
		};
		
		Consumer<Movie> c2=(m)-> {
			System.out.println(m.name );
			System.out.println("movie intrvl");
		};
		
		Consumer<Movie> c3=(m)-> {
			System.out.println(m.name );
			System.out.println("movie climax");
			};
			
		Movie m=new Movie("varnasi");
		c1.andThen(c2).andThen(c3).accept(m);
		
			
		Function<Integer, Integer> f1=(i)-> i*i*i;
		Function<Integer, Integer> f2=(i)-> i*2;
		
		System.out.println(f1.andThen(f2).apply(2));//16
		System.out.println(f1.compose(f2).apply(2));//64 ->f2 doing fiest later f1 will 
	}

}
