package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo7 {

	public static void main(String[] args) {
		Collection<String> fruits=new ArrayList<>();
		
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("water melon");
		System.out.println("fruitsList:"+fruits);
		
		//Iterator(interce)....any method that return any type
		//hasNext return boolean  , next() return Object
		
		
		Iterator<String> itr=fruits.iterator();
		System.out.println(itr);//print address of arraylist
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		for(String fru:fruits) {
//			System.out.println("Display fruits:"+fru);
//		}
		
	
	}

}
/*
  👇

✅ Iterator (java.util.Iterator)
🔹 What it is
   Used to traverse (iterate) a collection one element at a time

	methods	: hasNext() → checks if next element exists
			  next() → returns next element
			  remove() → removes current element safely 
✅ for-each Loop
	Simplified way to iterate collections/arrays
	Cannot remove elements directly
	No control over index
	Only forward traversal
 * */
