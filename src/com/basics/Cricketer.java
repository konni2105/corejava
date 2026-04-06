package com.basics;

public class Cricketer {
    //inst variables declaration
	int jno;
    String name;
    //static variables declaration
    static int countryId;
    static String countryName; 
     
	public static void main(String[] args) {
		System.out.println("welcome cricket team");
		//creating object for inst variables
		Cricketer c1=new Cricketer();
		//initializing inst data values
		c1.jno=3;
		c1.name="kohili";
		//initializing static data values
		countryId=21;
		countryName="India";
		//Accessing static data
		System.out.println("countryId :"+countryId);
		System.out.println("countryName :"+countryName);
        //Accessing inst data
		System.out.println("jrsy no:"+c1.jno);
        System.out.println("crkname:"+c1.name);
        System.out.println("===============");
        //creating object2 for inst variables
        Cricketer c2=new Cricketer();
  		//initializing inst data values
  		c2.jno=2;
  		c2.name="shing";
  		//initializing static data values
  		countryId=25;
  		countryName="bharat";
  		//Accessing static data
  		System.out.println("countryId :"+countryId);
  		System.out.println("countryName :"+countryName);
          //Accessing inst data
  		System.out.println("jrsy no:"+c2.jno);
        System.out.println("crkname:"+c2.name);	
        System.out.println("================");
        //creating object3 for inst variables
        Cricketer c3=new Cricketer();
  		//initializing inst data values
  		c3.jno=1;
  		c3.name="dhoni";
  		//initializing static data values
  		countryId=25;
  		countryName="bharat";
  		//Accessing static data
  		System.out.println("countryId :"+countryId);
  		System.out.println("countryName :"+countryName);
          //Accessing inst data
  		System.out.println("jrsy no:"+c3.jno);
        System.out.println("crkname:"+c3.name);	
	
	}

}
