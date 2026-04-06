package com.lab;
//Java program to perform addition, subtraction, multiplication, and division using int, byte, and short values.
//diplay the results clearly.
public class Lab8 {

	 public static void main (String[] args) {
//		 byte a=2;
//		 byte b=4;
//		int c=(a+b);
//		 short c1= (short)(a-b);
//		 int c2= (byte)(a/b);
		// System.out.println("c:"+c+" "+"c1:"+c1+" "+ "c2:"+c2);
		int a=2;
		int b=4;
		short c=3;
		short d=6;
		byte e=-128;
		byte f=4;
		
		System.out.println("add:"+(a+b)+" "+"sub:"+(a-b)+" "+"mul:"+(a/b) );
		System.out.println("add:"+(c+d)+" "+"sub:"+(c-d)+" "+"mul:"+(c/d));
		System.out.println("add:"+(e+f)+" "+"sub:"+(e-f)+" "+"mul:"+(e/f));	 
	 }
}
