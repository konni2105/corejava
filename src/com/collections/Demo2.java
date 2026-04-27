package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {

	public static void main(String[] args) {
		
		Collection<Integer> c=new ArrayList<>();//homogeneous;access only interger type only 
		//primitive data can be convert into obj data =autoboxing
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		c.add(500);
		
		System.out.println("using wrapper obj :"+c);//[100, 200, 300, 400, 500]
		System.out.println(c.hashCode());//to check addresses...it calls obj class method,ignores overridden
		System.out.println(System.identityHashCode(c));//always returns the original hash code of the object,ignores overridden
		/*hashCode() → "What object says about itself"
			identityHashCode() → "What JVM says about the object"*/
		
		
		//if we want to access hetrogeneous ele we need create object tye obj creation
		Collection<Object> c1=new ArrayList<>();
		c1.add(100);
		c1.add('a');
		c1.add("abhi");
		c1.add(10.0);
		c1.add(87.09787875);
		System.out.println("using Object :"+c1);
		System.out.println(System.identityHashCode(c1));
		System.out.println(c1.hashCode());

	}

}
