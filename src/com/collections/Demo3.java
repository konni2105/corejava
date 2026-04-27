package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {

	public static void main(String[] args) {
		Collection<String> boys=new ArrayList<>();

		boys.add("abhiram");
		boys.add("akash");
		boys.add("akhilesh");
		boys.add("akir");
		boys.add("abhinay");
		boys.add("ambani");
		System.out.println("boys:"+boys);//boys:[abhiram, akash, akhilesh, akir, abhinay, ambani]
		
		Collection <String> girls=new  ArrayList<>();
		girls.add("abhigna");
		girls.add("anusri");
		girls.add("akshya");
		girls.add("aruthi");
		girls.add("amani");
		girls.add("aneesha");
		System.out.println("girls:"+girls);//girls:[abhigna, anusri, akshya, aruthi, amani, aneesha]
		
		Collection <String> students=new  ArrayList<>();
		
		students.addAll(boys);
		students.addAll(girls);
		System.out.println(students);//[abhiram, akash, akhilesh, akir, abhinay, ambani, abhigna, anusri, akshya, aruthi, amani, aneesha]
	
	//	boys.clear();
		System.out.println(students);//[abhiram, akash, akhilesh, akir, abhinay, ambani, abhigna, anusri, akshya, aruthi, amani, aneesha]
		System.out.println(boys);//[] y bcz..we clear boys data na thats empty list came 
		
		
		System.out.println(boys.contains("ben10"));//false
		System.out.println(boys.contains("ambani"));//if boys list contain ambani then return true
		System.out.println(students.containsAll(boys));//return true if that collection contain all  ele in specified collection
		
		System.out.println(boys.containsAll(girls));//false
	}
	

}
