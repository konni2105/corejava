package com.multithread;

class Resource{
	int i=0;
	boolean  status=false;
	synchronized void put(int i) throws InterruptedException {
		this.i=i;
		while(status) {
			wait();
		}
		System.out.println("put:"+i);
		status=true;
		notify();//notifies the thread which is in waiting state
	}
	
	 synchronized void get() throws InterruptedException {
		 while(!status) {
			 wait();
		 }
		System.out.println("get:"+i);
		status=false;
		notify();
	}
}
class Product implements Runnable {
	Resource r;
	Product(){}
	Product(Resource r){
		this.r=r;
		Thread t=new Thread(this,"Product");
		t.start();//calls run metd
	}
	@Override
	public  void run() {
		int i=0;
		while(true) {
			
			try {
				r.put(i++);
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}
class Consumer implements Runnable{
	Resource r;
	Consumer(Resource r){
		this.r=r;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			
			try {
				r.get();
				Thread.sleep(100);
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
}
public class ProducerConsumer {

	public static void main(String[] args) {
		
		Resource r=new Resource();
		Product p=new Product(r);
		Consumer c=new Consumer(r);
		System.out.println("successsful");
		
		
	}

}
