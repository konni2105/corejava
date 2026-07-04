package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo12 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("raj");
		l.add("ashle");
		l.add("abhi");
		l.add("pradeep");
		System.out.println(l);//[raj, ashle, abhi, pradeep]
		//System.out.println(l.get(5));//IndexOutOfBoundsException
		l.remove("abhi");
		System.out.println("after remove: "+l);
		
		List<Integer> l1=new ArrayList<>();
		l1.add(5);
		l1.add(15);
		l1.add(25);
		l1.add(55);
		
		//l1.remove(25);//IndexOutOfBoundsException -> consider as index 
		l1.remove(l1.indexOf(25));//[5, 15, 55]
		
		l1.set(1,10);//replace the index position value
		System.out.println(l1);
		
		
	}

}
