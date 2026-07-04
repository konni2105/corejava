package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Comparator is used when you want multiple sorting logics
 * 
 List created → elements added (insertion order)
        ↓
Comparator defined (sorting rule = name)
        ↓
Collections.sort()
        ↓
compare() called multiple times
        ↓
List rearranged
        ↓
Printed in sorted order*/



//Using Anonymous Class
class Std{
	int id;
	String name;
	int marks;
	
	Std(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
}


public class ComparatorExple {

	public static void main(String[] args) {
		
			List<Std>l=new ArrayList<>();
			
			l.add(new Std(1,"pavi",37));
			l.add(new Std(2,"abhi",34));
			l.add(new Std(3,"ravi",32));
			
//whole thing is an expression that creates an object, and in Java every statement must end with ;
			Comparator<Std> c=new Comparator<Std>() 
			//anonymous class obj creation 
			{
				
				@Override
				public int compare(Std a, Std b) {
					
					return a.name.compareTo(b.name);//It compares names alphabetically
				}
			};
			
			Collections.sort(l, c); 
			for (Std s : l) { 
				System.out.println(s.id + " " + s.name + " " + s.marks);
			
	          }

      }
}
