package com.ArrayProgrames;
//WAP :ary repsntn with 6 elemts
public class AryDemo1 {

	public static void main(String[] args) {
		int[] numbers;//declartn
		numbers=new int[6];//creation with index->0 1 2 3 4 5
		//iniatilztn
		   numbers[0]=10;
		   numbers[1]=20;
		   numbers[2]=40;
		   numbers[3]=50;
		   numbers[4]=90;
		//repsntn
		   for(int i=0;i<numbers.length;i++) {
			   System.out.println(numbers[i] +" ");//intilaized values are 5 but index 6 so last values gives default value
			  }
		   for(int n:numbers) {
			   System.out.print(n +" ");
		   }
		   
	}

}
