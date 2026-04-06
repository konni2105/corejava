package com.loops;


import java.util.Scanner;

public class ForLp {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("entr num");
		int num=s.nextInt();
		//num decrement
		for(int i=10;i>=num;i--) {
			System.out.println(i);
		}
	}

}
/*numincrement so take <
for(int i=0;i<=num;i++) {
	System.out.println(i);
}*/