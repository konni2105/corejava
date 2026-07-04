package com.multithread;
/*
 create 3 threads 
 Thread1-2table
 Thread2-3table
 Thread3-5table*/
class TableThread extends Thread{
	int num;
	TableThread(int num){
		this.num=num;
	}
	public void run() {
		System.out.println("Table:"+num);
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i +"=" + (num*i) );
		}
		System.out.println();
	}
}
public class Task1  {

	public static void main(String[] args) throws InterruptedException {
		TableThread t1=new TableThread(2);
		TableThread t2=new TableThread(3);
		TableThread t3=new TableThread(5);
		t1.start();//random or mixed
		t1.join();//ordered
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}

}
