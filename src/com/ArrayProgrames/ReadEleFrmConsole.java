package com.ArrayProgrames;
//print entered ele and their count
import java.util.Scanner;

public class ReadEleFrmConsole {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int size=s.nextInt();
		int[] n=new int[size];
		System.out.println("plz enter "+ size+"ele");
		for(int i=0;i<size;i++) {
			n[i]=s.nextInt();
			//System.out.println(n[i]+" ");
			//print even nmbrs 
			if(n[i]%2==0) {
				System.out.println("even nmbrs in arr"+n[i]+" ");
			}
			System.out.println(n[i]+" ");
		}
//		
//		System.out.println("ary representation");
//		for(int i=0;i<size;i++) {
//			System.out.println(n[i]+" ");
//		}
	}
	

}
