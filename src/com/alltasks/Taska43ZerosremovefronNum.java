package com.alltasks;

import java.util.Scanner;

public class Taska43ZerosremovefronNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int r;
		 int s=0,s1=0;
		 while(a!=0) {
			r= a%10;
			a/=10;
			if(r!=0) {
				s=s*10+r;
			}}
			while(s!=0) {
				r= s%10;
				s/=10;
				s1=s1*10+r;
			}
			 
	 System.out.println(s1);
	 sc.close();}

}
