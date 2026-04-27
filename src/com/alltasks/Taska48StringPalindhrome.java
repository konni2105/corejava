package com.alltasks;
import java.util.Scanner;
public class Taska48StringPalindhrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		 String str=sc.next();
		 String rev="";
		 //1 method
		 for(int i=str.length()-1;i>=0;i--) {
			 rev=rev+str.charAt(i);
		 }
		 System.out.println(str.equals(rev)?"Palidhrome":"not Palindhrome");
		 //2 method
		 char c[]=str.toCharArray();
		 for(int i=c.length-1;i>=0;i--) {
			 System.out.print(c[i]+"");
		 }
		 System.out.println();
		 //3 method
		 byte[]s= str.getBytes();
		 for(int i=s.length-1;i>=0;i--) {
			 System.out.print((char)c[i]+"");
		 }

	sc.close();}

}
