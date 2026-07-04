package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Comparable is used when class itself defines default sorting.
 - A comparable pbj is capable of comparing itself with another object.
 - The class itself must implements the java.lang.Comparable interface to compare its instances.
 -  all wrapper objects implements comparable
   EX:  consider a movie class that has members like,rating,name,year.Suppose we wish to sort a list of movies 
   based on year of release.we can implement the cpmparable interface with the movie class,and 
   we override the method compare To() of Comparable interface .
   
   
 Collections.sort(l)
        ↓
compareTo() called
        ↓
marks compared
        ↓
list rearranged
        ↓
toString() used while printing
   
	>Comparable → “I decide my order”
	>Comparator → “You decide my order”
*/

class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	
	Student(int id ,String name ,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		
		return id+" "+name+" "+marks;
		
	}
	
	//natural sorting based on marks
	@Override
	public int compareTo(Student s) {
		
		return this.marks - s.marks;//ascending order     or return Integer.compare(this.marks, s.marks);
	}
	
}

public class ComparableExple {

	public static void main(String[] args) {
		    
		List<Student> l=new ArrayList<>();
		
		
		l.add(new Student(1,"pavi",85));
		l.add(new Student(2,"abhi",70));
		l.add(new Student (3,"anu",95));
		
   /*		Sorting → uses compareTo()
		    Printing → uses toString()    */
		
		//System.out.println(l);//without toString() prints obj of student class address 
		
		System.out.println(l);//with using toString() o/p: [1 pavi 85, 2 abhi 70, 3 anu 95]
		
		Collections.sort(l);//Collections.sort uses the compareTo method of Comparable to compare objects and rearrange them. If toString is overridden, it is used while printing the objects.”
		
		for(Student s: l) {
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}

		
		
		
	}

}
