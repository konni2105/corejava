package com.lab;
//create a class bank and take3 persons details accno,acc holder,balence

	public class Lab21 {
		static int accnumber=1234123;
		static String accholdr;
		static int balance;
		 {
			accnumber++; 
		 }
		   
		 public static void main(String[] args) {
			Lab21 t1=new Lab21();
			t1.accholdr="xyz";
			t1.balance=100;
			System.out.println("accholder:"+ accholdr+"  "+"balance:"+ balance+" "+"accnmber:"+ accnumber);
			
			Lab21 t2=new Lab21();
			t2.accholdr="abc";
			t2.balance=200;
			System.out.println("accholder:"+ accholdr+"  "+"balance:"+ balance +" "+"accnumber:"+ accnumber);
			
			Lab21 t3=new Lab21();
			t3.accholdr="lkg";
			t3.balance=300;
			System.out.println("accholder:"+accholdr+" "+"balance:"+ balance +" "+"accnumber:"+ accnumber);
		}
	}

