package com.lab;

//1. Write a Java program with a class employee using fields empid, empname, salary 
//Initialize the employee data at the time of variable declaration.
//Whenever an object(instance) is created, the program should automatically:
//1. Add 10% bonus to the salary-->10/100=0.1 increment
//2. Display the employee details immediately
public class Lab10 {
      int empid=101;
       String empname="Abhigna";
        static double salary=5000;
  //instance blk or inplace of this we also use method and that might be call in main mthd
    {
	   salary=salary+(salary*0.1);
	   System.out.println("empid:"+empid+" "+"empnm:"+ empname);
	   System.out.println("salary incre:"+ salary);
	 
   }	
   public static void main(String[] args) {

		Lab10 lb=new Lab10();
		new Lab10();//constructor
	}

}
