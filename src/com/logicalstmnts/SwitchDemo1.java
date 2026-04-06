package com.logicalstmnts;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a");
		int a=s.nextInt();
		System.out.println("enter b");
		int b=s.nextInt();
		System.out.println("enter symbl");
		char symbl=s.next().charAt(0);
		//String symbl=s.next();
		int res=0;
		switch(symbl) {
		case '+' -> res=a + b;
		case '-'-> res=a-b;
		case '/'-> res=a/b;
		case '%'-> res=a%b;
		case '*'-> res=a*b;
		default -> System.out.println("invalid symbol entry");
		}
		System.out.println("resvalue"+res);
	}

}
/*System.out.println("Enter week name:");
String day=s.next();
switch(day) {
case "sunday"->{
	System.out.println("oops!!nonvegg");
	System.out.println("but i'm veggieee");
}
case "monday"->{ 
	System.out.println("chapathiiii");
	System.out.println("but i eat fooriii");
}
case"tuesday","wednesday","thursday"->{
	System.out.println("boringggg");
}
case"friday"-> System.out.println("pre weekend");
case"sat","sun"->System.out.println("weekend");
default->System.out.println("restart....");
}*/