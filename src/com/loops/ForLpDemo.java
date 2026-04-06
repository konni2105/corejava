package com.loops;
//print 0 to 10 with even,odd,sum & avg
//print 10 to 0 with even,odd,sum & avg
public class ForLpDemo {

	public static void main(String[] args) {
		//prints even nmbrs in b/w 10 to 0 with decrement
		int sum=0;
		
		for(int i=10;i>=0;--i) {
			if(i!=0 && i%2==0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.print("sum"+sum);
		System.out.println();
		System.out.println("*****************");
		// prints even nmbrs in b/w 0 to 10 with increment
		for(int i=0;i<=10;i++) {
			if(i!=0 && i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("sum"+sum);
	}
	
}
