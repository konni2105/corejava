package com.lab;
//copy constructor
class Address {
	String city;
	//constructor
	Address(String city){
	this.city=city;//city (left) → object variable //city (right) → constructor parameter
	}
}
class Employee {
	int id;
	String name;
	Address address;
	Employee(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	//shallow copy
	Employee(Employee e1){
		this.id=e1.id;
		this.name=e1.name;
		this.address=e1.address;
	}
	//deepcopy
	Employee(Employee e1,boolean deepcopy){
		this.id=e1.id;
		this.name=e1.name;
		this.address=new Address(e1.address.city);//obj creation
	}
	
	public static void main(String[] args) {
		Address a=new Address("hyd");
		Employee e1=new Employee(1,"pavi",a);
		Employee shallow=new Employee(e1);
		Employee deep =new Employee(e1,true);
		System.out.println(e1.address.city);
		System.out.println(deep.address.city);
		
	}

}
