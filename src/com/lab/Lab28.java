package com.lab;

import java.util.Scanner;



public class Lab28 {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entr arysize: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Entr " + n + " elemts: ");
        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("entr srch ele: ");
        int trgt = scanner.nextInt();
        scanner.close();

        boolean foundEle = false;
        
        /*
         for (int num : arr) {
            if (num == trgt) {
                foundEle = true;
                break;
            }
        }

        if (foundEle) {
            System.out.println(trgt + " found");
        } else {
            System.out.println(trgt + " not found");
        } */
        
        for (int i = 0; i < n; i++) {
            if (numbers[i] == trgt) {
              foundEle = true;
                     System.out.println("Element " + trgt + " found at position " + (i + 1));
             
            }
            
        }
        if (!foundEle) {
            System.out.println(trgt + " not found");
        }
    }
}
