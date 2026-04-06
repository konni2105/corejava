package com.programs;

import java.util.Scanner;

//"peterson"nmbr-->sum of its digits related to power of the nmbr of digits
//153=1^3+5^3+3^3 
public class AmstrngNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int temp=n;
		int rem=0;
		int sumPwr=0;
		
		while(n!=0) {
			rem=n%10;
			n=n/10;
			sumPwr=sumPwr+rem*rem*rem;//(only for 3 digitnm)
		}
		if(temp==sumPwr) {
			System.out.println("armstrngnumbr:"+sumPwr);
		}else {
			System.out.println("not armstrngnumbr");
		}
	}

}
