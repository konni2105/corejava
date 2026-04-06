package com.lab;

 class Vehicle {
	 String brand;
	 int modelYear;
	 Vehicle(String brand){
		 this.brand=brand;
		 System.out.println("Vehicle constructor called!!");
	 }
	public static void main(String[] args) {
		System.out.println("vehicle class main method");
		}
}

 class  Car extends Vehicle{
	Car(String brand, int modelYear){
		super(brand);
		this.modelYear=modelYear;
		
		System.out.println("Car constructor called!!");
	}
	public static void main(String[] args) {
		System.out.println("car class main method");
		}
}

 class ElectricCar extends Car{
	 ElectricCar(String brand, int modelYear){
		super(brand,modelYear);
		System.out.println("electriccar constructor called!!");
	 }
	public static void main (String argd []) {
		ElectricCar ec=new ElectricCar("honda",2003);
		ec.show();
	}
void show() {
	System.out.println("brand:"+brand);
	System.out.println("modelyear:"+modelYear);
}

}