package com.programs;

import java.util.Scanner;
/*Input: Decimal number
Output: Binary number
-Read decimal number n
-Initialize empty string binary = ""
-While n > 0:
	remainder = n % 2
	prepend remainder to binary
	n = n / 2
-Print binary*/
public class ConvrtDecimalToBinry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int[] bin = new int[32];
        int i = 0;

        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
		
		
		
		
		
		
		
		
		
		//using string
		/* int rem=0;
		String binary="";
		while(n!=0||n>0) {
			rem=n%2;
			n=n/2;
			binary=rem+binary;
			
		}
		System.out.println("binary value"+binary);*/

	}

}
