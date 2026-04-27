package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo8 {

	public static void main(String[] args) {
		
		Collection<Integer> num=new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(50);
		
		
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			
			//remove() → removes current element safely 
			if(itr.next()==30) {
				itr.remove();
			}
		}
		
		System.out.println(num);//[10, 20, 40, 50, 50]
		num.remove(50);//[10, 20, 40, 50]

//		for(Integer i: num) {
//			System.out.print(i+" ");
//		}
	}
	

}
