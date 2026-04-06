package com.ArrayProgrames;
//string array representation
public class AryDemo {

	public static void main(String[] args) {
		String[] names; //ary declaration
		names=new String[4];//ary creation with index 0 1 2 3
		
		//initialization
		names[0]="mikky";
		names[1]="tom";
		names[2]="jerry";
		names[3]="pikachu";
		
		//representation
		//forlp:prints index based
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);//gives stored value
		}
		//using for each : prints every element
		for(String  n:names) {
			System.out.println(names);//gives adress 
			System.out.println(n);//gives stored value
		}
		
		
 }
}