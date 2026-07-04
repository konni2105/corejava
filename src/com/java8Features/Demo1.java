package com.java8Features;
/*
 * Lambda Expressions:
 *      introduced to reduce the complexity of the programming or to consice coading
 *      
 */

@FunctionalInterface
interface In{
	public abstract void method1();
	
}

class TestDemo implements In{

	@Override
	public void method1() {
		System.out.println("java 8 features");
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
	TestDemo td=new TestDemo();
	//In td=new TestDemo();//upcasting
	td.method1();

	}

}
