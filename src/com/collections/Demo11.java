package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo11 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("raj");
		l.add("ashle");
		l.add("abhi");
		l.add("pradeep");
		System.out.println(l);//[raj, ashle, abhi, pradeep]
		//System.out.println(l.get(5));//IndexOutOfBoundsException
		
		System.out.println(l.indexOf(2));//-1 -> its not there in list so return -1
		System.out.println(l.indexOf("abhi"));//2
		
		List<String> l1=new ArrayList<>();
		l1.add("tom");
		l1.add("jerry");
		l1.add("pikachu");
		l1.add("ben");
		System.out.println(l1);//[tom, jerry, pikachu, ben]
		
		List<String> l2=new ArrayList<>();
		l2.add("jan");
		l2.add("feb");
		l2.add("mar");
		l2.add("apr");
		System.out.println(l2);
		
		List<String> names=new ArrayList<>();
		names.addAll(l);
//		names.addAll(l1);
		names.addAll(1,l2);
		
		System.out.println(names);
		
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));//get()-> brings ele based on indexs
		}
	}

}
