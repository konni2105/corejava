package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo9 {

	public static void main(String[] args) {
		Collection<Integer> num=new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
     
		//while iterating there no chance to remove or modify
//		for(Integer i:num) {
//			System.out.println(i+" ");
//		}
		
		
		//when ever we want modification or to remove 
		//iterator contains remove() 
		Iterator<Integer> it1=num.iterator();
		while(it1.hasNext()){
			
			if(it1.next()==30) {
			it1.remove();	
			}
			
		}
		//System.out.println(it1.next()+" ");
		num.remove(10);
		System.out.println(num);
		
	}

}
