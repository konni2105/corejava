package com.langfundm;
//swaping 2 var
public class Oprtrs {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("a value:"+a+" "+"b value:"+b);
		System.out.println("**************");
		int a1=5;
		int b1=10;
		int temp=a1;
		a1=b1;
		b1=temp;
		
		System.out.println("a value:"+a1+" "+"b value:"+b1);
		
		
	}

}
