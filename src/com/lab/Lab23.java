package com.lab;
//print number without using int
/*public class Lab23 {
	static {
		System.out.println('1');
		System.out.println('2');
		System.out.println('3');
		System.out.println('4');
		System.out.println('5');
	}
	public static void main(String[] args) {
		System.out.println("100");
		boolean one=true;
		boolean two=true;
		boolean three=false;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}*/
//foreach--> for(dataType variable : collectionOrArray){
//           }
class Lab23{
	public static void main(String args[]) {
		char[] nums= {'1','2','3','4'};
		for(char c:nums) {
			System.out.println(c);
		}
	}
}