package com.lab;
/*check whether a student is eligible for a scholarship.
Conditions:
         a)Attendance percentage must be greater than or equal to 75
         b)Exam score must be greater than or equal to 60
Requirements:
           a.Use the logical       AND (&&) operator
           b.Print "Eligible for Scholarship" or "Not Eligible for Scholarship"*/


import java.util.Scanner;

public class Lab261 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks:");
		double attendancePrcntg=s.nextDouble();
		int examScore=s.nextInt();
		String result=(attendancePrcntg>=75)&&(examScore>=60)?"Eliglible for Scolarship":"Not Eligible!!!";
		System.out.println("Result:"+result);
		}
}


