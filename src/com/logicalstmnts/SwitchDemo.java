package com.logicalstmnts;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a:");
		double a=s.nextDouble();
		System.out.println("Enter b:");
		double b=s.nextDouble();
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.modulus");
		
		System.out.println("enter choice:");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1 -> System.out.println("add"+ (a+b));
		case 2-> System.out.println("add"+ (a+b));
		case 3-> System.out.println("add"+ (a+b));
		case 4-> System.out.println("add"+ (a+b));
		case 5-> System.out.println("add"+ (a+b));
		}
	}

}
/*switch(choice){
		case 1:
			System.out.println("add:"+(a+b));
			break;
		case 2:
			System.out.println("sub:"+(a-b));
			break;
		case 3:
			System.out.println("mul:"+(a*b));
			break;
		case 4:
			System.out.println("div:"+(a/b));
			break;
		case 5:
			System.out.println("mod:"+(a%b));
			break;
		default:
			System.out.println("Learn from scratch");
		}*/