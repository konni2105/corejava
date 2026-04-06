package com.lab;

import java.util.Scanner;

//BMI Calculator Using Type Casting
//Write a Java program to calculate BMI using the formula:
//BMI = Weight/ (height) ^2
//Conditions:
//Take weight as a double
//Take height as a double.Calculate BMI and convert the final result to int using type casting

public class Lab14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entr weight value:");
		double weight =s.nextDouble();
		//double weight=45.6;
		//double height=4;
		System.out.println("entr height value:");
		double height =s.nextDouble();
		double BMI =(weight/(height*height));
		System.out.println(BMI);
		 int BMI1 = (int)(weight/(height*height));//implicit typecast
		 System.out.println("typecast:"+ BMI1);
	}

}

