package com.alltasks;

import java.util.Scanner;

public class InterfacePaymentDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean choose;
		System.out.println("welcome to Payments Transactions");
		// using interface reference
		InterfacePayment p;
		// using parent class
		Debit p1 = new Debit();

		System.out.println("select your Payment Mode like online/offline");
		String mode = sc.nextLine().toLowerCase();
		do {
			switch (mode) {
			case "online" -> {
				p = new UPI();
				p.paybill(500000);
			}
			case "offline" -> {
				p1.paybill(2000);
			}
			}
			System.out.println("Do you want Continue Transactions: yes/no");

			choose = sc.next().equalsIgnoreCase("Yes");
		} while (choose == true);
		sc.close();
	}

}
