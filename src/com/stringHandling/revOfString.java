package com.stringHandling;

public class revOfString {

	public static void main(String[] args) {
		String s="java is simple";
		
		String[] words=s.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

}
