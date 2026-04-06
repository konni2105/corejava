package com.lab;
//wrapper obj data types
public class Lab11 {

	public static void main(String[] args) {
		Integer num = 10;    // wrapper object
		Double price = 99.99;
        Character grade = 'A';
        
        int a = 5;
        Integer obj1 = a;   // primitive to obj(wrpr) autoboxing
        
        Integer  obj2= 20;
        int b = obj2;       //obj(wrpr) to premitive unboxing
        
        String s="123";
        //String s1="456";
        int i1=Integer.parseInt(s);//converting str to int using method
        
        int a1 = 10;
        String s1 = a1 + ""; 
        
        double d = 15.55;
        String s2 = d + "";// convrt premitive to str
        
        System.out.println(num);
        System.out.println(price);
        System.out.println(grade);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(s);
	}

}
