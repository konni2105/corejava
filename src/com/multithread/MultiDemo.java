package com.multithread;
/*
MT: reduce the response time
     TO perform multiple tasks in a " same time "
            In a single program,how multiple tasks are executing simultaneously with help context switching & with the stack 
Thread: lightweight execution process in a program or small unit in a program ex:in chrome opens a new tab
		-every thraed has its own stack frame
		-execution happend inside the stack area
		-it is class from java.lang package 
		
process: a complete independent program ex:chrome

multitasking:  
       PBM:  PROCESS BASED MULTITHREADING
       			each task is a seperate independent program
       			ex: cpu related 
       TBM:  THREAD BASED MUTLITASKING
           		each task in a program 	will consider as TBM
           		
           		
           		
           		
           		
           		
           		synchronized block purpose: prevents thread creations
       		 	
			
*/
public class MultiDemo  extends Thread{
	
	public  void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++) {
			System.out.println("run"+i);
		}

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());//return current class thread i.e main
	
		MultiDemo md=new MultiDemo();
		md.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main"+i);
		}
		
	
	}

}
