package com.constructors;
class Welcome{
	String name="C";
	}


class ConstructorDemo5 extends Welcome {
	String name="A";
	public static void main(String[] args) {
	System.out.println("CopyConstructor mainmethod");
	//ConstructorDemo5 a=new ConstructorDemo5();
	
	}
	
}
class Constructor  extends ConstructorDemo5{
	String name="B";
	public static void main(String[] args) {
		System.out.println("Constructor mainmethod");	
		Constructor b=new Constructor();
		b.show();
	}
	void show() {
	System.out.println(((Welcome)this).name);
	System.out.println(super.name);
	System.out.println(this.name);
	
	}
}