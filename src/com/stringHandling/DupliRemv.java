package com.stringHandling;

public class DupliRemv {

	public static void main(String[] args) {
		String[] str= {"app","ban","app","man"};
		int n=str.length;
		System.out.println(str);//address
		//print dupli ele
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(str[i].equals(str[j])) {
					System.out.println("dupli ele:"+str[i]+" ");
					
				}
			}
		}
		
		//remove dupli ele
		for(int i=0;i<n;i++) {
			boolean isDupli=false;
			for(int j=0;j<i;j++) {
				if(str[i].equals(str[j])) {
					isDupli=true;
					break;
					
				}
			}
			if(!isDupli) {
				System.out.print(str[i]+" ");
			}
		}
	
	
	}
		

}


