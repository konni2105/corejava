package com.programs;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();

        int temp = n;   // store original number
        int rem = 0;
        int rev = 0;

        while (n != 0) {
            rem = n % 10; //153%10->3 | 15%10->5 |1%10->1
            n = n / 10;//153/10->15 | 15/10->1 |1/10->0
            rev = rev * 10 + rem;
            
        }

        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
