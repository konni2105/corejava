package com.logicalstmnts;

import java.util.Scanner;

public class ElseIf1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks percentage");
        double marksP=s.nextDouble();
        //udsing ternary
        String result =
        	    (marksP > 100 || marksP < 0) ? "Invalid percentage" :
        	    (marksP >= 90) ? "grade a" :
        	    (marksP >= 80) ? "grade b" :
        	    (marksP >= 70) ? "grade c" :
        	    (marksP >= 60) ? "grade d" :
        	    (marksP >= 35) ? "Just pass" :
        	    "don't waste time, chadhuvuko first!\n u r failed";

        	System.out.println(result);

	System.out.println("main method ended");
	}
}
/*double marksP=s.nextDouble();
	if(marksP>100 || marksP<0) {
		System.out.println("Invalid percentage");
	}else if(marksP>=90){
		System.out.println("grade a");
	}else if(marksP>=80){
		System.out.println("grade b");
	}else if(marksP>=70){
		System.out.println("grade c");
	}else if(marksP>=60){
		System.out.println("grade d");
	}else if(marksP>=35){
		System.out.println("Just pass");
	}else {
		System.out.println("don't waste time,chadhuvuko first!");
		System.out.println("u r failed");
	}*/