package com.loops;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String yesno="";
		
		do {
		System.out.println("enter a number");
		int a=s.nextInt();
		
		System.out.println("enter b number");
		int b=s.nextInt();
		
		System.out.println("entr sysmbl + - * % /");
		String symbl=s.next();
		int result=0;
		
		switch(symbl) {
		case"+"->result=a+b;
		case"-"->result=a-b;
		case"*"->result=a*b;
		case"%"->result=a%b;
		case"/"->result=a/b;
		default->System.out.println("invalid sysmbl");
		}
		System.out.println("result"+" "+result);
		System.out.println(" do u want to continue..?click Y/N");
		yesno=s.next();
		}while(yesno.equalsIgnoreCase("Y"));
	}

}
