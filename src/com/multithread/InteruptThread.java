package com.multithread;

class Demo implements Runnable{
	int n=5;
	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			try{
				Thread.sleep(5000);//5sec delay
				System.out.println(i);
				System.out.println(Thread.currentThread());
				System.out.println("thraed wokeup nrmlly");
				
			}catch(InterruptedException e) {
				System.out.println(e);
				//e.printStackTrace();
				
			
				System.out.println("thread interruption happens");
			}
		}
		
	}
	
}

public class InteruptThread {

	public static void main(String[] args) {
		Thread t=new Thread(new Demo());
		t.start();
		t.interrupt();
		try{
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	
		
		

	}

}
