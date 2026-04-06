package com.lab;

import java.util.Scanner;
//display ele at evn indx
public class Lab291 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entr arysize: ");
        int arrsize = scanner.nextInt();
        
        int[] numbers = new int[arrsize];
        System.out.println("Entr " +arrsize + " elemts: ");
        for(int i=0;i<arrsize;i++) {
        	numbers[i]=scanner.nextInt();
        	}
        
	}

}
