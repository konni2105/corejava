package com.java8FeaturesStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("nishitha","aslesha","pavitra","sindhu","malathi","aslesha","pavitra","navya");
		
		List<String> l1=names.stream()
		                 .map(s-> s+"-vcube")
		                 .sorted()
		                 .distinct()
		                 .collect(Collectors.toList());
		l1.forEach(System.out::println);
		
		
List<String> nms=Arrays.asList("nishitha","aslesha","pavitra","sindhu","malathi","aslesha","pavitra","navya");
		
		List<String> updatednames=nms.stream()
		                 .map(String::toUpperCase)
		                 .sorted()
		                 .distinct()
		                 .collect(Collectors.toList());
		updatednames.forEach(System.out::println);
	}

}

