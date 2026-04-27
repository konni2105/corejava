package com.alltasks;

import java.util.Scanner;

public interface InterfacePayment {
	public abstract void paybill(double pay);

}

class UPI implements InterfacePayment {

	Scanner sc = new Scanner(System.in);

	@Override
	public void paybill(double pay) {
		Double bal = pay;
		System.out.println("*********Online Payment Transaction********");
		System.out.println("enter UPI Payment");
		String upiId = sc.next();
		if (validateUPId(upiId)) {
			System.out.println("enter bill amount");
			double billAmount = sc.nextDouble();
			bal -= billAmount;
			System.out.println("Successfully doned ");
		} else {
			System.out.println("invalid upid");
		}
	}

	boolean validateUPId(String id) {
		if (id.equals("${10}[0-9]{1}[@]{3}[a-z]^")) {
			return true;
		} else {
			return false;
		}
	}
}

class Debit implements InterfacePayment {
	Scanner sc = new Scanner(System.in);

	@Override
	public void paybill(double pay) {
		Double bal = pay;
		System.out.println("*********Card Payment Transaction********");
		System.out.println("enter card no (must be 12 digits)");
		String cardid = sc.next();

		System.out.println("enter CVV no (last 4 digits)");
		String cvv = sc.next();

		if (validatecardid(cardid) && validatecvv(cvv)) {
			System.out.println("enter bill amount");
			double billAmount = sc.nextDouble();
			bal -= billAmount;
			System.out.println("Successfully Doned ");
		} else {
			System.out.println("invalid Cardno / cvv ");
		}
	}

	boolean validatecardid(String cardid) {
		if (cardid.matches("${12}[1-9]")) {
			return true;
		} else {
			return false;
		}
	}

	boolean validatecvv(String cvv) {
		if (cvv.matches("${4}[0-9]")) {
			return true;
		} else {
			return false;
		}
	}

}
