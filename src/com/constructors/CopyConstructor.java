package com.constructors;
class CopyConstructor{
	int sid;
	String sname;
	String sbranch;
	
	CopyConstructor(int id,String name,String branch ){
		this.sid=id;
		this.sname=name;
		this.sbranch=branch;
	}
	CopyConstructor(CopyConstructor c){
		sid=c.sid+1;
		sname="abhi";
		sbranch=c.sbranch;
	}

	public static void main(String[] args) {
		CopyConstructor c=new CopyConstructor(101,"known","AIML"); 
		c.show();
		CopyConstructor c1=new CopyConstructor(c);
		c1.show();
	}
	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sbranch);
	}
}