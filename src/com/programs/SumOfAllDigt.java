package com.programs;

import java.util.Scanner;

public class SumOfAllDigt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int n=s.nextInt();
		int sum=0;
		int rem=0;
		//using while:
		while(n!=0) {
			rem=n%10; //345%10-->5 |34%10-->4 |3%10-->3 
			n=n/10;//345/10-->34 |34/10-->3 |3/10-->0
			sum=sum+rem;//3+4+5=12
		}
		//using forlp
		/*for(int i;n!=0;n/=10) {
		    int r=n%10;
			sum=sum+r;
		}*/
		System.out.println("sum of digits "+sum);
	}

}

