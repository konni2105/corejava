package com.ArrayProgrames;

public class JaggedAry1 {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5},{6,7,8,9},{10}};//jaged ary
		System.out.println(arr);//address of an ary
		System.out.println("array length "+arr.length);//4 rows with diffnt clums values
        System.out.println(arr[0].length);//3 clumns 
        System.out.println(arr[1].length);//2 clums
        System.out.println(arr[2].length);//4 clums
        System.out.println(arr[3].length);//1 clums
        System.out.println("Array Representation");
//        for(int i=0; i<arr.length;i++) {
//        	for(int j=0;j<arr[i].length;j++) {
//        		System.out.print(arr[i][j]+" ");
//        	}
//        	System.out.println();
//        }
        for(int[] n1:arr) {
        	for(int n:n1) {
        		System.out.print(n+" ");
        	}
        	System.out.println();
        }
        
	}
}
