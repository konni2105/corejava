package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class retaillAll {

	public static void main(String[] args) {
	/*	Collection<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		Collection<Integer> list2=new ArrayList<>(Arrays.asList(10,11,22,33,44,55));
		Collection<Integer> list3=new ArrayList<>(Arrays.asList(10,11,60,70,80));
		
		ArrayList<Integer>result=new ArrayList(list1);
		
		result.retainAll(list2);
		result.retainAll(list3);
		
		if(result.isEmpty()) {
			System.out.println("no common ele");
		}else {
			System.out.println("common ele in all three"+result);
			
		}
		System.out.println("list1 ele:"+list1);
		System.out.println("list2 ele:"+list2);	
		System.out.println("list3 ele:"+list3);	
		
		*/
		
		Collection <String> fruits=new ArrayList<>();
		fruits.add("man");
		fruits.add("org");
		fruits.add("apl");
		fruits.add("grp");
		fruits.add("promo");
		fruits.add("pinapl");
		fruits.add("potato");

		
		Collection <String> veggies=new ArrayList<>();
		veggies.add("tomato");
		veggies.add("potato");
		veggies.add("onion");
		veggies.add("bendi");
		veggies.add("cabbage");
		
		System.out.println(fruits);  //[man, org, apl, grp, promo, pinapl, potato]
		System.out.println(veggies);  //[tomato, potato, onion, bendi, cabbage]
		
		
		
		fruits.retainAll(veggies);//return common element i.e potato
		
		System.out.println(fruits);//no O/P
		System.out.println(veggies);//[tomato, potato, onion, bendi, cabbage]
		
		
		//length() vs length vs size()
		System.out.println(veggies.size());//5
		System.out.println(fruits.size());//1 due to retainAll arylst updated so common ele return 
		
		
		//WAP to convert from collection to array?
		
		Object[] vg=veggies.toArray();
		
		for(Object v:vg) {
			System.out.println(v+" ");
		}
		
		
		
	}

}
