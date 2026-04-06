package com.logicalstmnts;
//return switch in method 
import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int n=s.nextInt();
		System.out.println(getDay(n));
	s.close();
	}
	static String getDay(int n){
		System.out.println("geyDay method with arg & return");
		return switch(n) {
		case 1 -> "A";
		case 2-> "B";
		case 3-> "H";
		case 4-> "I";
		case 5-> "G";
		case 6-> "N"; 
		case 7-> "A";
		default->"invalid entry";
	};
	}
}
