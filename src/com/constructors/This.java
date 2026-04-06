package com.constructors;
//this--> invoke/accessing current class obj
//this()-->constructor chaining
public class This {
	int eid;
	int eage;
	String ename;
	This(){
		System.out.println("no arg constrct");
		eid=100;
		eage=20;
		ename="unknown";
	}
	This(int eid){
		System.out.println("1 arg constrct");
		this.eid=eid;
		
	}
	This(int eid,int eage){
		System.out.println("2 arg constrct");
		this(eid);
		this.eage=eage;
	}
	This(int eid,int eage,String ename){
		System.out.println("3 arg constrct");
		this(eid,eage);
		this.ename=ename;
	}
	void show() {
		System.out.println(eid+" "+eage+" "+ename);
		System.out.println("**************************");
	}
	public static void main(String[] args) {
		This t=new This();
		t.show();
		This t1=new This(101);
		t1.show();
		This t2=new This(102,22);
		t2.show();
		This t3=new This(103,23,"known");
		t3.show();
	}

}
