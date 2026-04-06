package com.langfundm;

import java.util.Scanner;

//with arg;no return
public class Methoddemo2 {
	static void stdNm(String fname,String lname) {
		System.out.println("std nm :"+ fname +" "+lname);	
	}
	static void stId(int id) {
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
		Methoddemo2 m=new Methoddemo2();
		stdNm("abhi","pavi");
		stId(101);
		m.stRlno(1);
		m.stPrcntg(82);
		m.stStatus("pass");
		m.stMail("xyz@gmail.com"); 
		m.stPhno(123456789);
		m.stClgNm("vcube");
		m.stAdrs("hyd-kphb");
	}
}
