package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * streamAPI -> presents in java.util.stream package
 *  stream: sequence of elements supporting sequentail and parallel operations
 *              intermediate operatn: returns stream
 *                                     filter(),map(),sorted()
 *              terminal opertn: produce a result 
 *                                collect(),forEach(),reduce()  
 *                                
 *                                
 */

//WAP print even num from list of data
public class Demo1 {

	public static void main(String[] args) {
	
		List<Integer>l=Arrays.asList(10,40,66,88,43,67,43,22);
		
	/*	Stream<Integer>s=l.stream();
		List<Integer>l1=s.filter(i-> i %2==0).collect(Collectors.toList());
		System.out.println(s);
		
		System.out.println(l);
		System.out.println(l1);   */
		
		List<Integer> l1=l.stream()
		                  .filter(i->i%2==0)
		                  .collect(Collectors.toList());
		System.out.println(l1);//[10, 40, 66, 88, 22]
		
		
		List<String> ls=Arrays.asList("abhi","pavi","pavitra","abhigna");
		List<String>ls1=ls.stream()
				           .filter(s-> s.length()>=5)
				           .sorted()
				           .collect(Collectors.toList());
		System.out.println(ls1);
		
		
		List<Double> sal=Arrays.asList(50000.0,350000.0,450000.0,220000.0);
		List<Double> sal1=sal.stream()
				             .map(s-> s+500.0)
				             .filter(i-> i>=300000.0)
				             .collect(Collectors.toList());
		
	
		//::--> represents method reference
		sal1.forEach(System.out::println);// or 	//System.out.println(sal1);
				     
	}

}
