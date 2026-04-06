package com.logicalstmnts;

import java.util.Scanner;

public class ElseIf2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
        int age=s.nextInt();
        //using ternary
       /* String result =
                (age < 0 || age > 100) ? "Invalid age" :
                (age <= 5)            ? "You are a kid" :
                (age <= 12)           ? "You are a child" :
                (age <= 19)           ? "You are a teen" :
                (age <= 35)           ? "You are young" :
                (age <= 60)           ? "You are an uncle" :
                                       "You are a senior citizen\nEligible for pension";
				System.out.println(result);*/
        
        //using switch
       /* String result;
        if (age < 0 || age > 100) {
            result = "Invalid age";
        } else {
            result = switch (age) {
                case 0,1,2,3,4,5        -> "You are a kid";
                case 6,7,8,9,10,11,12  -> "You are a child";
                case 13,14,15,16,17,18,19 -> "You are a teen";
                case 20,21,22,23,24,25,26,27,28,29,
                     30,31,32,33,34,35 -> "You are young";
                case 36,37,38,39,40,41,42,43,44,45,
                     46,47,48,49,50,51,52,53,54,55,
                     56,57,58,59,60 -> "You are an uncle";
                default -> "You are a senior citizen\nEligible for pension";
            };
        }
        System.out.println(result);*/
        
	if( age<0 || age>100) {
		System.out.println("unna lenattueee");
	}else if(age<=5){
		System.out.println("u r a kid");
	}else if( age<=12){
		System.out.println("u r a child");
	}else if(age<=19){
		System.out.println("u r a tean");
	}else if(age<=35){
		System.out.println("we are young");
	}else if(age<=60){
		System.out.println("u r a uncle😄");
	}else {
		System.out.println("u r a senior citizen");
		System.out.println("Eligible for pension ");
	}
	System.out.println("main method ended");
	s.close();
	}
}