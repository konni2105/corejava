package com.multithread;



/*
 * Write a Java program using the Runnable interface to
 *  create a thread that prints numbers from 1 to 5
 *  add delay of 1sec before each number using sleep*/

public class RunbleIntrfc implements Runnable{
	private int n;
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			//System.out.println(i+" ");
			try {
				Thread.sleep(1000);
		
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		 
		Thread t=new Thread(new RunbleIntrfc() );
		t.start();
	}

	

}
