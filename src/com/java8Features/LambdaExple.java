package com.java8Features;



interface In2{
	public abstract void add(int a,int b);
}


public class LambdaExple {

	public static void main(String[] args) {
		In2 t2=( a, b)-> {
			int sum=a+b;
			System.out.println("sum of 2 nums:"+sum);
			
		};
		t2.add(10,20);

	}

}
