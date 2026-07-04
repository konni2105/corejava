package com.java8Features;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CnvrtIntToRoman {

	public static void main(String[] args) {
		
		//using arrays
		Scanner sc=new Scanner(System.in);
		System.out.println("entr num:");
		int num=sc.nextInt();
		
		int[] values= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		 String[] symbols = {"M", "CM", "D", "CD", "C", "XC",
                 "L", "XL", "X", "IX", "V", "IV", "I"};
		 
		
		 
//		 for(int i=0;i<values.length;i++) {
//			 while(num >=values[i]) {
//				   str=str+symbols[i];
//				   num=num-values[i];
//				 
//			 }
//		 }
//		 System.out.println(str);  
		 
		 
		 //using predefined FI
		
		 // // Predicate -> checks number is valid or not
		Predicate<Integer>p= n-> n>0;
		
		// Function -> converts integer to roman
		Function<Integer , String > f= n->{
			String str="";
			 for(int i=0;i<values.length;i++) {
				 while(n >=values[i]) {
					   str=str+symbols[i];
					   n=n-values[i];
					 
				 }
			 }
			 
			 return str;
		};
		

        // Consumer -> prints result
        Consumer<String> c = r -> {

            System.out.println("Roman Number : " + r);
        };

        // Check and print
        if (p.test(num)) {

            c.accept(f.apply(num));
        }
        else {

            System.out.println("Invalid Number");
        }
		 

	}

}
