package com.lab;

public class Lab22 {
  int accno;
  String custname;
  double balnc;
  Lab22(){
	  accno=1234;
	  custname="unknown";
	  balnc=150;
	  
  }
  Lab22(int acno){
	  this();
	  this.accno=acno;
	  }
  Lab22(int acno,String custnm){
	  this(acno);
	  this.custname=custnm;
	  }
  Lab22(int accno,String custnm,double blnc){
	  System.out.println("3-arg");
	  this(accno,custnm);
	  this.balnc=blnc;
	  
  }
  void display() {
	  System.out.println("**********************");
	  System.out.println("account nmbr:"+accno);
	  System.out.println("customer name:"+custname);
	  System.out.println("balance:"+balnc);
	  System.out.println("**********************");
  }
  
	void main() {
		Lab22 l=new Lab22(1,"fhg",5464.87);
		l.display();
	}

}
