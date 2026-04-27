package com.alltasks;

class Code implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iam Runnable " + i);

		}
		System.out.println(Thread.currentThread());
	}
}
class Writer  implements Runnable{
	Writer(){
		System.out.println("iam writer class");
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even Thread "+i);
			}
		}
		System.out.println(Thread.currentThread());
	}
	
}
class Reader  implements Runnable{
	Reader(){
		System.out.println("iam writer class");
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Even Thread "+i);
			}
		}
		System.out.println(Thread.currentThread());
	}}

public class Taska48ThreadUsingRunnable {

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(Thread.currentThread());
		Code c = new Code();
		Thread t = new Thread(c);
		t.start();
		System.out.println("***************************");
		Writer w=new Writer();
		Thread t1 = new Thread(w);
		t1.start();
		Reader r=new Reader();
		Thread t2 = new Thread(r);
		t2.start();

	}

}
