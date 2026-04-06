package com.operators;

public class BitwiseOptr {

	public static void main(String[] args) {
		System.out.println(25&3);
		System.out.println(61&7);
		System.out.println(84&21);
		System.out.println(72&36);
		System.out.println("============");
		System.out.println(25|3);
		System.out.println(61|7);
		System.out.println(84|21);
		System.out.println(72|36);
		System.out.println("===========");
		System.out.println(25^3);
		System.out.println(61^7);
		System.out.println(84^21);
		System.out.println(72^36);
		System.out.println("================");
		//System.out.println(-(n+1));
		System.out.println(~63);
		System.out.println("===========");
		int a=86;
		int b=2;
		System.out.println(a<<b);//leftshift
		System.out.println(a>>b);//rightshift
		
		
	}

}
