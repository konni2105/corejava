package com.lab;

import java.util.Scanner;
//WAP Count how many elemts are evn&add in ary
public class Lab29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entr arysize: ");
        int arrsize = scanner.nextInt();
        
        int[] numbers = new int[arrsize];
        System.out.println("Entr " +arrsize + " elemts: ");
        
        int evncount=0;
        int oddcount=0;
        for (int i = 0; i < arrsize; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("even numbers:");
        for(int n:numbers) {
        	if(n%2==0) {
        		System.out.print(n+" ");
        		evncount++;
        	}
        }
        System.out.print("odd numbers:");
        for(int n:numbers) {
        	if(n%2!=0) {
        		System.out.print(n+" ");
        		oddcount++;
        	}
        }
        System.out.println("evencount"+evncount);
    	System.out.println("oddcount"+oddcount);
	}

}
