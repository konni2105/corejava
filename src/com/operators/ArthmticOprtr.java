package com.operators;
//+,-,*,/,%
//String can only be combined using +
//Arithmetic operators (+,-, *, /, %) work ONLY on numbers
public class ArthmticOprtr {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		
		System.out.println("a"+a+b);
		System.out.println("a"+1+2+3);//a123-->string with append will perform
		System.out.println("addition:"+(a+b));//13(BODMAS)
		//System.out.println("addition:"-a);❌-->string with anything not discovered
		System.out.println("subtraction:"+(a-b));//7
		System.out.println("multiplication:"+(a*b));//30
		System.out.println("division:"+(a/b));//3--> (integer division)not consider float value
		
		//System.out.println(10/0);//Integer division by zero ❌compile error
		System.out.println(10.0/0);//Floating division by zero ✅infinity
		
		System.out.println("modulus:"+(a%b));//1
		System.out.println("*****************************");
		
		//int+double-->double
		System.out.println(10/4.0);//2.5
		//char+int-->int(ASCII)
		System.out.println('a'+2);
		char c='c';
		System.out.println(c+1);//a=97,b=98,c=99+1-->100
		System.out.println((char)(c+5));//c+d+e+f+g+h
		System.out.println((char)(c-2));//a
		//char+char-->int 
		System.out.println('A'+'B');//131-->int value not char
		
		System.out.println(10+2*3);//16-->BODMAS rule
		
		// pre(++a/--a) --> change first then print
		System.out.println(++a);//a=10,+1
		System.out.println("pre ++a value:"+ (++a));
		System.out.println(--a);
		System.out.println("pre --a value:"+a);//a=10,-1
		
		// post(a++/a--) -->print first,then change   
		System.out.println(a++);//post:a=10,+1
		System.out.println(a--);//post:a=11,-1
		int p=5;
		int q=7;
		//add 2 nmbrs w/0 using + operator
		System.out.println("add 2 nmbrs w/0 + operator :"+ (p-(-q)));//12
		
		System.out.println(7 % -3);//1-->Sign of result depends on dividend (7)-

	}

}
