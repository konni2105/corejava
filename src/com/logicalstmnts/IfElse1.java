package com.logicalstmnts;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("r u attending the clses????");
		boolean areYouAttending=sc.nextBoolean();
		
		System.out.println("r u completing assignments????");
		boolean areYouCompletingAssignmnt=sc.nextBoolean();
		
		System.out.println("r u attending the weektest????");
		boolean areYouAttendingWeekTest=sc.nextBoolean();
		
		System.out.println("r u attending the mock inerview????");
		boolean areYouAttendingMockIntrw=sc.nextBoolean();
		
//		if(areYouAttending==true && areYouCompletingAssignmnt && 
//				areYouAttendingWeekTest && areYouAttendingMockIntrw) {
//			System.out.println("u will get job in 6 months");
//		}
		if(areYouAttending||areYouCompletingAssignmnt  ||
				areYouAttendingWeekTest || areYouAttendingMockIntrw) {
			System.out.println("u will get job in 6 months");
		}
		else {
			System.out.println("Thurpu thirigi dandom pettu");
		}
		System.out.println("main method ended");
	}

}
