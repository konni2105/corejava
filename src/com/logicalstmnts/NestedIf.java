package com.logicalstmnts;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("👩‍🏫welcome to the interview");
		System.out.println("👨‍🎓hlo ma'am,tnq 😊"); 
		Scanner s=new Scanner(System.in); 
		System.out.println("enter name:");
		String name=s.next();
		System.out.println("okay ms."+ name +" shall we start naa");
		
		System.out.println(" Do you have knowledge of Java?");
		boolean knowsJava = true;
		if(knowsJava) {
		System.out.println(" S, Core Java and basics ");
		
		System.out.println("Good. Do you know SQL?");
		boolean knowsSQL = true;
		if (knowsSQL) {
            System.out.println("S, joins, subqueries, group by....");

            System.out.println(" Nice. Have you done any projects?");
            boolean hasProjects = false;
            if (hasProjects) {
                System.out.println("i did academic and mini projects");

                System.out.println("okay! How is your communication skill?");
                boolean goodCommunication = true;
                if (goodCommunication) {
                    System.out.println("I can communicate clearly ma'am 🙂(chustunnavga vini nv e chpu)");
                    System.out.println("Excellent! we will get back u ");
                }else {
                    System.out.println("I am improving...");
                    System.out.println("Work on communication. HOLD");
                }

            } else {
                System.out.println("Not yet, but currently working on it");
                System.out.println("Complete at least one project!");
            }

        } else {
            System.out.println(" Basic knowledge i have ");
            System.out.println("SQL is mandatory.just focus on it");
        }

    } else {
        System.out.println(" Not sure");
        System.out.println(" Java is mandatory for this role. Rejected ❌");
     }
 
  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


