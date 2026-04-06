package com.programs;
//FirstMultiple of 7
public class FirstMultiple {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("Found: " + i);
                break;
            }
            System.out.println(i);
        }

	}

}
