package com.lab;

import java.util.Scanner;

//given nmbr is even or odd using relational oprtr


class Lab25 {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ent nmbr : ");
	int n=s.nextInt();
	boolean res=(n%2==0);
	System.out.println(res+"Numvalue:"+n);
	// boolean res=(n&1)==0;
	//boolean res=((n/2)*2==n);//or (n%2==0)
	//System.out.println(res?"even":"odd"+"Numvalue:"+n);//?--> ternary oprtr
	s.close();
	
	}
}
/*if(n%2==0) 
System.out.println("even:"+n);
else
System.out.println("odd:"+n);*/

//in array
/*String[] res= {"even","odd"};
System.out.println(res[n%2]+":"+n);*/
