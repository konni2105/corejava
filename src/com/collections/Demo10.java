package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo10 {

	public static void main(String[] args) {
	List<Integer> l= new ArrayList<>();
	System.out.println("AryLstSIze:"+l.size());//0
	l.add(10);
	l.add(1,20);//IndexOutOfBoundsExcptn ...when we add to empty list 
	l.add(2,30);
	l.add(3,14);
	l.add(null);
	System.out.println(l);//[10, 20, 30, 14,null]

	}

}
