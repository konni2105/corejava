package com.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



/*
->  Stores student details
	Calculates grades using Function
	Filters students using Predicate
	Prints student details using Consumer  
	
	Functional Interfaces Used
Interface	             Purpose	Method Used
Function<T,R>	         Takes input and returns output	apply()
Predicate<T>	         Checks condition and returns boolean	test()
Consumer<T>	              Consumes data without returning anything	accept()
	*
	*/
class Student{
	String nm;
	int marks;
	
	public Student(String nm,int marks ) {
		super();
		this.nm=nm;
		this.marks=marks;
	}
}
public class Demo4 {


	public static void main(String[] args) {
	
		Function<Student , String> f1=(s)->{
			String grade=" ";
			if(s.marks>100 || s.marks<0) {
				 grade="invalid";
			}else if(s.marks>=90){
				grade="A";
			}
			else if(s.marks>=65){
				grade="B";
			}
			else if(s.marks>=45){
				grade="c";
			}
			else if(s.marks>=35){
				grade="pass";
			}else {
				grade="fail";
			}
			return grade;
		};
		
		Student s1=new Student("abhi",80);
		Student s2=new Student("lulu",65);
		Student s3=new Student("bubu",70);
		Student s4=new Student("dudu",8);
		
//		Student[] stdlist=new Student[5];
//		stdlist[0]=s1;
//		stdlist[2]=s2;
//		stdlist[3]=s3;
//		stdlist[4]=s4;
		
		List<Student> l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		Predicate<Student> p=(st)->st.marks >=60;
		
//		for(Student stdlist:l) {
//			if(p.test(stdlist)) {
//			System.out.println("name of std:"+stdlist.nm);
//			System.out.println("marks of std:"+stdlist.marks);
//			System.out.println("grade of std:"+f1.apply(stdlist));
//			System.out.println("*********************");
//			}
//		}
		
		Consumer<Student>c=(st)->{
		
			System.out.println("name of std:"+st.nm);
			System.out.println("marks of std:"+st.marks);
			System.out.println("grade of std:"+f1.apply(st));
			System.out.println("*********************");
		};
		for(Student stdlist:l) {
			if(p.test(stdlist)) {
				c.accept(stdlist);
			}
		}
	}

}
