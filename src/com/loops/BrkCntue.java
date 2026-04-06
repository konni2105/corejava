package com.loops;
/*	break → Terminates loop execution
	continue → Skips current iteration */
public class BrkCntue {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println("hlo"+i);
			if(i==5) {
				break;
			}
		}
		System.out.println("***********");
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("hi"+i);
		}
	}

}
