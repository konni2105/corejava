package com.lab;
//create nmbr of object and print count of objects with out using blocks
public class Lab19 {
	static int  count=0; 
	 Lab19(){
			count++; 
	 }
		public static void main(String[] args) {
		Lab19 l1=new Lab19();
		Lab19 l2=new Lab19();
		Lab19 l3=new Lab19();
		System.out.println("nmbr of objs:"+ count);

	}

}
