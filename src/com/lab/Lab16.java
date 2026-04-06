package com.lab;

public class Lab16 {
	static String companyName="Vcube";
	static int insuranceFee=500;
	static int amount=1500;
	
	 static void welcome(){
		
	}
	static int dailyRate() {
		
		
		return amount;
	}
	static int insurance() {
		
		return insuranceFee;
	}
	static int baseAmount(int days){
		
		return  days;
	}
	static int totalAmount(){
		
		return (baseAmount(12)*dailyRate()) + insurance();
	}
	
	public static void main(String[] args) {
		System.out.println("Totalamount return:"+totalAmount());

	}

}
