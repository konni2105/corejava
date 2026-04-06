package com.langfundm;
//no arg:no return
import java.util.Scanner;
public class Methoddemo1 {
	static String name;
	 static void hlo() {
//		Scanner s=new Scanner(System.in);
//		System.out.println("ent name:");	
//		String name=s.nextLine();
		System.out.println("hlomthd");
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("mainmthd");
		Scanner s=new Scanner(System.in);
		System.out.println("ent name:");	
		String name=s.nextLine();
		System.out.println("ent str nm:");
		String nm=s.nextLine();
		//Methoddemo1 m=new Methoddemo1();
		hlo();
		
		 

	}

}
