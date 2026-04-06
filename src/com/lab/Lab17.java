package com.lab;

import java.util.Scanner;

public class Lab17 {
	static int balance=5000;
	
	 
	static void checkbalance(){
		
		System.out.println("current balance"+balance);
		 
	}
	static void deposit(int amount){
		System.out.println("deposit amount");
		balance=balance+amount;
		
		
	}
	static void withdraw(int amount){
		System.out.println("withdraw amount");
		balance=balance-amount;
	}
	public static void main(String args[]) {
		System.out.println("main method!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount deposit:");
		
		int dep=sc.nextInt();
		deposit(dep);
		System.out.println("enter the withdraw:");
		int wit=sc.nextInt();
		withdraw(wit);
		checkbalance();
		sc.close();
	}
}
