package com.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



class Emp{
	
	String  nm;
	double sal;
	
	public Emp(String nm,double sal) {
		this.nm=nm;
		this.sal=sal;
	}
}
public class Demo5 {

	public static void main(String[] args) {
		//add bonus
		Function<Emp , Double>f= e -> e.sal+500;
		
		//filters sal based on cond''
		Predicate<Emp> p= e-> e.sal >=42000;
		
		//prints employee details
		Consumer<Emp> c = e -> {

	            System.out.println("Employee Name : " + e.nm);
	            System.out.println("Employee Salary : " + e.sal);
	            System.out.println("Bonus Salary : " + f.apply(e));
	            System.out.println("************************");
	        };
	        
	        // Employee objects
	        Emp e1 = new Emp("Abhi", 25000);
	        Emp e2 = new Emp("Ravi", 35000);
	        Emp e3 = new Emp("Kiran", 45000);
	        Emp e4 = new Emp("Neha", 20000);
		
		List<Emp> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		 // Filter and print
        for (Emp emp : l) {

            if (p.test(emp)) {
                c.accept(emp);
            }
        }
			
		
	}

}
