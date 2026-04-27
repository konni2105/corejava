package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class retaillAll {

	public static void main(String[] args) {
		Collection<Integer> list1=new ArrayList<>();
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
		
	}

}
