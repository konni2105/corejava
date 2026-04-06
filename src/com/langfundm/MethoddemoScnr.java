package com.langfundm;

import java.util.Scanner;

//with arg;no return
public class MethoddemoScnr {
	 void stdNm(String fname,String lname) {
		System.out.println("std nm :"+ fname +" "+lname);	
	}
	 void stId(int id) {
		System.out.println("std id: "+id);	
	}
	void stRlno(int no) {
		System.out.println("std rolnnmbr : "+ no);	
	}
	void stPrcntg(int percntg) {
		System.out.println("std percentage : "+ percntg);	
	}
	void stStatus(String status) {
		System.out.println("std status : "+ status);	
	}
	void stMail(String mail) {
		System.out.println("std mail : "+mail);	
	}
	void stPhno(long phno) {
		System.out.println("std mblno : "+phno);	
	}

	void stClgNm(String cname) {
		System.out.println("std clgnm : "+cname);	
	}
	void stAdrs(String addrs) {
		System.out.println("std addrs : "+addrs);	
	}

	public static void main(String args[]) {
		System.out.println("main method");
		
		MethoddemoScnr m=new MethoddemoScnr();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ent stdid : ");
		int stdid=sc.nextInt();
		
		System.out.println("enter fname: ");
		sc.nextLine();
		String fname=sc.nextLine();//storing value
		
		System.out.println("enter lname: ");
		String lname=sc.next();
		
//		System.out.println("ent stdid : ");
//		int stdid=sc.nextInt();
		
		System.out.println("ent stdrlno: ");
		int strlno=sc.nextInt();
		
		System.out.println("ent stdpercntg: ");
		int strpercntg=sc.nextInt();
		
		System.out.println("enter stdstatus: ");
		String ststatus=sc.next();
		
		System.out.println("enter stdmail: ");
		String stmail=sc.next();
		
		System.out.println("ent stdphno: ");
		long stphno=sc.nextLong();
		
		System.out.println("enter stdclgnm: ");
		String stclgnm=sc.next();
		
		
		System.out.println("enter stdaddrs: ");
		String staddrs=sc.next();
		 
		System.out.println("......std details........");
		//calling method
		m.stdNm(fname,lname);
		m.stId(stdid);
		m.stRlno(strlno);
		m.stPrcntg( strpercntg);
		m.stStatus(ststatus);
		m.stMail(stmail); 
		m.stPhno( stphno);
		m.stClgNm(stclgnm);
		m.stAdrs(staddrs);
		sc.close();
	}
	
}
