package com.ArrayProgrames;
/*
 1)arry declaration: int[] arr;
                     int[] ages;
 2) ary creation: 
 				  arr=new int[5];
 				  ages=new int[3];
 3) ary initilztn:
 					ages[0]=21;
 					ages[1]=3;
 					ages[3]=24;
 4) representation:
                 System.out.println(ages[0]);
                  System.out.println(ages[1]);
                   System.out.println(ages[2]);
                   
            for(int i=0;i<ages.length;i++){
            System.out.println(ages[1]);
            }
               (or)
            //foreach loop
            for(int a:ages){
            System.out.println(a);
            }
  */

public class AryIntro {

	public static void main(String[] args) {
		//int a=10;//variable declaration
		//int a=new int(10);invalid
		//int[] arr =new int[];invalid-->ary size not declared
		
		int[] arr =new int[4];//valid
		arr[0]=1;
		arr[1]=5;
		arr[2]=7;
		arr[3]=9;
//		for(int i=0;i<arr.length;i++){
//           System.out.println(arr);//gives address
//          }
	    
		for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);//gives arr values
		}
	}

}
