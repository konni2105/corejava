package com.alltasks;

class Sleep implements Runnable {

	public void run() {
		for (int i = 1; i <5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("run" + i); 
			} catch (InterruptedException e) {

				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			 
		}
	}
}

public class Taska48ThreadSleepInterrupt {

	public static void main(String[] args) {
		
		Sleep s = new Sleep();
		Thread t = new Thread(s);
		t.start();
		t.interrupt();
	}
}
