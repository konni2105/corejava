package com.constructors;
//super--> refer parent class obj
//super()--> calling parent class constructor
class Super {
	String model;
	String brand;
	Super(){
		System.out.println("super-no arg construct");
	}
	Super(String model,String brand){
		System.out.println("parametrized construct");
	}
	//when we run Super cls that time only Super mainmethod executed
	public static void main(String[] args) {
		System.out.println("super main method");
		Super s=new Super();
	}

}
class Sup extends Super{
	
	Sup(){
		//super()--> automatically calls by jvc---> refers parent class no arg construct
		System.out.println("sup-no arg construct");
	}
	Sup(String model,String brand){
		this.model=model;
		this.brand=brand;
		System.out.println("parametrized construct");
		show();
	}
	public static void main(String[] args) {
		System.out.println("sup main method");
		Sup s=new Sup();
		s.show();
		Sup s1=new Sup("suziki","kya");
		
		}
	void show() {
		System.out.println("modelname:"+model+ " "+"brandname:"+brand);
		System.out.println("***********************************");
//		System.out.println(model);
//		System.out.println(this.model);
//		System.out.println(super.model);
	}
}