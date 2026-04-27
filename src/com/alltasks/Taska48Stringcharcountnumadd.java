package com.alltasks;

public class Taska48Stringcharcountnumadd {

	public static void main(String[] args) {
		 String s="aaabbcc";
		 int  res[]=new int[127];
         for(int i=0;i<s.length();i++) {
        	 res[s.charAt(i)]++;
         }
        	 for(int i=0;i<res.length;i++) {
        		 if(res[i]>0) {
        			 System.out.print((char)i+""+res[i]); 
        		 }
         }
	}

}
