package com.logicalstmnts;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int total = 0;
	        char choice;
	     do{
			 System.out.println("Enter category (fruits / veggies):");
			 String catg=s.next();
			 int price=0;
	        
	        switch (catg) {
	        	case "fruits" -> {
	                System.out.println("Enter item:");
	                String item = s.next();

	                switch (item) {
	                    case "apple" -> price = 250;
	                    case "orange" -> price = 120;
	                    case "grapes" -> price = 140;
	                    case "banana" -> price = 80;
	                    case "pomegranate" -> price = 350;
	                    default -> System.out.println("Entered fruit not available");
                       }
                   }

	        	case "veggies" -> {
	                System.out.println("Enter item:");
	                String item = s.next();

	                switch (item) {
	                    case "carrot" -> price = 50;
	                    case "barbati" -> price = 30;
	                    case "potato" -> price = 30;
	                    case "ladiesfinger" -> price = 20;
	                    case "beetroot" -> price = 40;
	                    default -> System.out.println("Entered veggie not available");
                        }
                    }

	        	default -> System.out.println("Entered category not available");
           }   
	        
	     //add current price to total     
	        total += price;

            System.out.println("Current item price: " + price);
            System.out.println("Total bill so far: " + total);

            System.out.println("Do you want to continue? (y/n)");
            choice = s.next().charAt(0);  
	     }while(choice == 'Y' || choice == 'N');

	        System.out.println("Final Total Bill = " + total);
	        System.out.println("Thank you");
	        s.close();
	}
}
