package com.operators;

public class ReltnlOprtr {

	public static void main(String[] args) {
		boolean x=false;
		boolean y=true;
		System.out.println(x=y);
		
		int a = 10;
		int b = 20;
        int c = 10;

        System.out.println(a == c);        // true
        System.out.println(a == b);        // false
        System.out.println(a != b);        // true
        System.out.println(a < b == true); // true
       // System.out.println(a < b < c);     // 5 ❌error--> cant br chained
        //System.out.println(a = b);         // 6 ❌error-->assignment returns int
		      
	}

}
