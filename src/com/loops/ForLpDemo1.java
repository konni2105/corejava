package com.loops;

import java.util.Scanner;

//factors of a given number
//-->divide the given number exactly, without leaving any remainder.
public class ForLpDemo1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entr num");
		int num=s.nextInt();
		findFactors(num);

	}
	static void findFactors(int num){
		int sum=0;
		//i is the factor of num
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i+" ");
				sum+=i;//add factor to sum
			}
		}
		System.out.println("sum of factors"+sum);
	}

}
/*sum += i
 sum = 1 + 2 + 3 + 4 + 6 + 12 = 28
---------------------------------------
 (sum += num)
sum = 12 + 12 + 12 + 12 + 12 + 12
sum = 72
*/

