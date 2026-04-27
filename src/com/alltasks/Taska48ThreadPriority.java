package com.alltasks;

import java.util.Scanner;

class Child extends Thread {
	int n;

	Child(int n) {
		this.n = n;
	}

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}

class Parent implements Runnable {
	Thread th;
	int n;

	Parent(int n,Thread th) {
		this.n = n;
		this.th=th;

	}

	@Override
	public void run() {
		 
		for (int i = 1; i <= 20; i++) {
			if(i==10) {
				try {
					th.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}

public class Taska48ThreadPriority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your multiplications table-c");
		int table = sc.nextInt();
		System.out.println("Enter your multiplications table-p");
		int table1 = sc.nextInt();
		Child c = new Child(table);//Thread class
		Parent p = new Parent(table1,c);//Runnable Interface
		Thread th = new Thread(p);
		c.start();
		th.start();
		sc.close();
	}

}
