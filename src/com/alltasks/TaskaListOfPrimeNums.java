package com.alltasks;

import java.util.Scanner;

public class TaskaListOfPrimeNums {
	public static boolean isPrime(long r) {
		 if (r <= 1) {      
		        return false;
		    }
		 
		for (int i = 2; i <= r / 2; i++) {
			if (r % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		long y = sc.nextLong();
		long temp = y;
		long stop=y;
		int d = 10;
		while(stop!=0) {
		while (y >= d/10) {
			long r=y%d;
			if (isPrime(r)) {
				System.out.println(r);
			}
			y= y/ 10;
		}
		d = d * 10;
		y=temp;
		stop=stop/10;
		System.out.println("-------------------------");
		
		}
		sc.close();

	}
}
