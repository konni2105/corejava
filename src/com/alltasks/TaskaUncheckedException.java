package com.alltasks;

import java.util.Scanner;

public class TaskaUncheckedException {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 try {
			 System.out.println("enter a num");
			 int x=sc.nextInt();
			 System.out.println("enter a num");
			 int y=sc.nextInt();
			 System.out.println(x/y);
			 }
		 catch(Exception e ) {
			 System.err.println(e.getMessage());
			 e.printStackTrace();
		 }	}

}
