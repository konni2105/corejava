package com.multithread;

import java.util.Scanner;

class EvenNum implements Runnable{
	int num;

    EvenNum(int num) {
        this.num = num;
    }
	@Override
	public void run() {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("evn nmbrs"+i );
			}
		
		}
		
	}
	
}
class OddNum implements Runnable{
	 int num;

	    OddNum(int num) {
	        this.num = num;
	    }
	@Override
	public void run() {
		
		for(int i=1;i<=num;i++) {
			if(i%2 != 0) {
				System.out.println("odd nmbrs"+i );
			}

		}
		
	}
	
}

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter num:");
		int num=s.nextInt();
		
		Thread t1=new Thread(new EvenNum(num));
		Thread t2=new Thread(new OddNum(num));
		t1.start();
		t2.start();

	}

}
