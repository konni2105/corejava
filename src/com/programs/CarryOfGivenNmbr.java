package com.programs;

import java.util.Scanner;
/* code prints the total number of carry operations 
 that occur when adding two 
 integers digit by digit (from right to left).*/
public class CarryOfGivenNmbr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        /*	count → stores number of carry operations
			carry → stores carry from previous digit addition*/
        int count=0;
        int carry=0;
        //Loop continues until both numbers become 0
        while(a!=0 || b!=0) {
        	int rem1=a%10;//Extracts last digit of number.
        	int rem2=b%10;
        	if(rem1+rem2+carry>=10){
        		count++;
        		carry=1;
        	}else {
        		carry=0;
        	}
        	a=a/10;
            b=b/10;
        }
        System.out.println("carry is"+count);
	}

}
