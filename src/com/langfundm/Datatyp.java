package com.langfundm;
//premitive datatypes 
//by default RHS numbers are interger values
//bydefault RHS decimal numbers are double 
//implitypct->automatic done by java no data loss
//explicttypcst->manually happens data 
//default values pf primitives-->byte,short,int,long=0 float,double=0.0,ch=space,bool=flse
public class Datatyp {
	byte b = 127;
	// byte b1=128;//type mismatch: cant convrt int to byte
	short s = 32767;
	// short=32768// type mismatch cant convert int to short
	int i = 2147483647;// 2^31
	int i2='A';//char-->int 
	long L = 9223372036854775807L;// 2^63
	// float f=5.0;//cant covrt double to float
	float f = 5.0f;
	float f1 = 45.34576756464467f;
	float f2 = 89763475869857f;
	double d = 2;// implicit -->int to float
	double d1 = 45.34576756464467D;
	char c = 'A';
	char c1 = '5';
	char c2 = 65;// return ascii value--> int to char
	
	boolean boo=true;
//	boolean b1=0;
//	boolean b2=1;
//	boolean b3=True;
//	boolean b4=False;
//	boolean b5="true";
//	boolean b6="false";
// boolean only take false or true
	public static void main(String[] arg) {
		Datatyp dt = new Datatyp();
		System.out.println("byte value:" + dt.b);
		System.out.println("short value:" + dt.s);
		System.out.println("int value:" + dt.i);
		System.out.println("int value:" + dt.i2);
		System.out.println("long:" + dt.L);
		System.out.println("float:" + dt.f);
		System.out.println("float:" + dt.f1);
		System.out.println("float:" + dt.f2);
		System.out.println("double:" + dt.d);
		System.out.println("double:" + dt.d1);
		System.out.println("char:" + dt.c);
		System.out.println("char:" + dt.c1);
		System.out.println("char:" + dt.c2);// default value space
		System.out.println("boolean:" + dt.boo);
		int p = 10;
		double q = p;
		System.out.println("impli" + q);// widening or impli typcast i.e add .0 to 10
		double r = 5.75;
		int s = (int) r;
		System.out.println("expli:" + s);
		
	}

}
