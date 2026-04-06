package com.lab;
//how many ways an object used as garbage collector
//4ways: nullfing,anonymous,reassigning,runs gc in jvm
public class Lab1 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method!!");
	}
		
	void hlo(){
			System.out.println("hlo method");
		}
		
	
		public static void main(String[] args) {
		System.out.println("main method");
		Lab1 lb1=new Lab1();
		Lab1 lb2=new Lab1();
		Lab1 lb3=new Lab1();
		
		lb1=null;//nullifying
		//Gc gc4=new Lab1();
		new Lab1().hlo();// anonymous
		lb1=lb2;//reassigning
		//runs grbgrclctr in jvm
		System.gc();
		System.out.println("end");		
		//System.out.println(lb2);
		//System.out.println(lb3);
		//System.out.println(lb4);
	}

}

