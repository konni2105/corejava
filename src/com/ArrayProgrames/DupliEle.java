package com.ArrayProgrames;
//DUPLI ELEMNTS that appear only once
public class DupliEle {

	public static void main(String[] args) {
		int[] arr= {1,2,4,2,3,5,4,2};
		System.out.println("dupli ele and count");
		
		//print dupli elemts
		for(int i=0;i<arr.length;i++) {
			boolean isDupli=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDupli=true;
					break;
				}
			}
			if(!isDupli) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
						break;
					}
				}
			}
		}	
		System.out.println("ele appear once");
		for(int i=0;i<arr.length;i++) {
			boolean unique=true;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					unique=false;
					break;
				}
			}
		if (unique) {
				System.out.println(arr[i]+" ");
			}
		}
		

	}

}
