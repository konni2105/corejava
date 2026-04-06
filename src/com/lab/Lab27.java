package com.lab;

import java.util.Scanner;

public class Lab27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter jnm:");
		int jnum=s.nextInt();
		switch(jnum) {
		case 1 -> System.out.println("RAHUL");
		case 7 -> System.out.println("MSD");
		case 8-> System.out.println("RAVINDRA JADEJA");
		case 45-> System.out.println("HITMAN");
		}
		
	}

}
//pgrm:display days
/*System.out.println("Enter number:");
int num=s.nextInt();

switch(num) {
case 1 -> System.out.println("Sun-day");
case 2-> System.out.println("Mon-day");
case 3-> System.out.println("Tue-day");
case 4-> System.out.println("Wed-day");
case 5-> System.out.println("Thur-day");
case 6-> System.out.println("Fri-day");
case 7-> System.out.println("Sat-day");
}*/