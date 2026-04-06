package com.programs;

import java.util.Scanner;

//1011₂ = (1×2³) + (0×2²) + (1×2¹) + (1×2⁰) = 11₁₀
/*Input: Binary number
  Output: Decimal number
-Initialize decimal = 0
-Initialize power = 0
-While binary number is not zero:
		Extract last digit using % 10
		Multiply digit with 2^power
		Add result to decimal
		Increase power
		Remove last digit using / 10
-Print decimal value*/
public class ConvrtBinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary != 0) {
            int digit = binary % 10;
            decimal = decimal + digit * (int) Math.pow(2, power);
            power++;
            binary = binary / 10;
        }

        System.out.println("Decimal value: " + decimal);

	}

}
