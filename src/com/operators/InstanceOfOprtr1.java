package com.operators;
class A{
	
}
class B extends A{
	
}


class InstanceOfOprtr1{

	public static void main(String[] args) {
		
		B obj=new B();
		System.out.println(obj instanceof A);//true
		System.out.println(obj instanceof B);//true
		A obj1=new A();
		System.out.println(obj1 instanceof A);//true
		System.out.println(obj1 instanceof B);//false
	}

}
