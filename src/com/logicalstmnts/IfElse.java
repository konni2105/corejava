package com.logicalstmnts;

//if else switch case default break continue for while do
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner s=new Scanner(System.in);
		System.out.println("enter age:");
		int age=s.nextInt();
		if(age>18) { 
			System.out.println("vote veyyu");
			System.out.println("eligible for vote ");
		}
		else { 
			System.out.println("arey babu niku inka time undiraa!!");
			System.out.println("not eligible");
			}
		System.out.println("main method ended");
	}

}
