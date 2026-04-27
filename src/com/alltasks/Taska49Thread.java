package com.alltasks;
class Thread1 extends Thread {
	public void run() {
		System.out.println("I LV JAVA!!");
	}
 
}
class Thread2 extends Thread1{
	public void run(){
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		}
 
}

public class Taska49Thread  {
	 
	public static void main(String[] args) {
		 Thread1 t1 =new Thread1();
		 t1.start();
		 Thread1 t2 =new Thread2();
		 t2.start();
	}
}
