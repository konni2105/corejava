package com.lab;
//create nmbr of object and print count of objects
public class Lab2 {
	static int  count=0; 
	{
		count++;
	}
	public static void main(String[] args) {
		Lab2 l1=new Lab2();
		Lab2 l2=new Lab2();
		Lab2 l3=new Lab2();
		System.out.println("nmbr of objs:"+count);

	}

}
