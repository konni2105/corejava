package com.basics;

public class Gc {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method!!");
	}
		void hlo(){
			System.out.println("hlo method");
		}
		
	public static void main(String[] args) {
		System.out.println("main method");
		Gc gc1=new Gc();//obj creation
		Gc gc2=new Gc();//  "
		Gc gc3=new Gc();//  "
		gc1=null;//nullifying
		//Gc gc4=new Gc();
		new Gc().hlo();// anonymous
		gc1=gc2;//reassigning
		//runs grbgrclctr in jvm
		System.gc();
		System.out.println("end");		
		//System.out.println(gc2);
		//System.out.println(gc3);
		//System.out.println(gc4);
	}
}	
		

