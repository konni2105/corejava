package com.langfundm;

//nrmlobjdatatyp
import java.math.BigInteger;
import java.math.BigDecimal;

class demo {

}

public class Datatyp1 {
//nrml obj data types default values r null
	String s;
	String s1 = "Abhigna";// str litral obj
	String s2 = new String("Vcube");// str obj

	BigInteger bi = new BigInteger("2146668421245768763542124568");
	BigInteger bi1 = new BigInteger("2146668421245768763542124568");
	BigDecimal bd;
	
//  wrapper obj data types 
//	byte b;//default val 0
//	short st;//default val 0
//	long lg;//default val 0
//	float f;//default val 0.0
//	double d;//default val 0.0
	Integer i;// default val null
	Character c;// default val null
	Boolean boo;// default val null
	demo d;
	
	int z=65;
	float g=(float)z;
	public static void main(String[] args) {
		System.out.println("main method!!");
		Datatyp1 dt = new Datatyp1();
		dt.s1 = "pavitra";
		System.out.println("str val:" + dt.s);
		System.out.println("str lit obj:" + dt.s1);
		System.out.println("bgint val:" + dt.bi);
		System.out.println("str obj:" + dt.s2);
		System.out.println("bgint val:" + dt.bi1);
		System.out.println(dt.bi.add(dt.bi1));
		
		System.out.println("bgdec:" + dt.bd);
		
		// System.out.println("bytval:"+dt.b);
		// System.out.println("shr:"+dt.st);
		// System.out.println("flt:"+dt.f);
		// System.out.println("lng:"+dt.lg);
		// System.out.println("dobl:"+dt.d);
		System.out.println("int:" + dt.i);
		System.out.println("chr:" + dt.c);
		System.out.println("boo:" + dt.boo);
		System.out.println(dt.g);
	}
}
