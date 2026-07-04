package com.multithread;

/*Write a Java program using the Runnable interface to 
 create multiple threads and display the name of the 
 thread that is currently executing.*/

class PrintThreadName implements Runnable{

	private String name;

	public PrintThreadName(String name) {
		this.name=name;
	}


	@Override
	public void run() {
	System.out.println("runnable name:"+name);
		System.out.println("actual thrd:"+Thread.currentThread().getName());
	}

}
public class Task2 {

	public static void main(String[] args) {
    /*	//using  same Runnable object	
     PrintThreadName ptn1=new PrintThreadName("abhigna");
		Thread t1=new Thread(ptn1);
		t1.setName("abhigna");  
		
	 PrintThreadName ptn2=new PrintThreadName("abhinaya");
		Thread t1=new Thread(ptn2);
		t1.setName("abhinaya");  
		
		             or
		*/
	/*	
	 * //using lambda
		Thread t1=new Thread(()->{
			System.out.println("actual thrd:"+Thread.currentThread().getName());
		}, "abhigna"); 
		
		Thread t2 = new Thread(() -> {
		    System.out.println("Thread: " + Thread.currentThread().getName());
		}, "abhinaya");*/
			
		
		//using setName()
		Thread t1 = new Thread(new PrintThreadName("abhigna"));// or Thread t1=new Thread(new PrintThreadName("abhigna"),"abhigna");
		t1.setName("abhigna");

		Thread t2 = new Thread(new PrintThreadName("abhinaya"));
		t2.setName("abhinaya");
		
		t1.start();
		t2.start();
	}

}
