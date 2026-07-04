package com.stringHandling;
/*
 * Example
Input: "abcabcbb"
Output: "abc"
Input: "bbbbb"
Output: "b"*/
public class longSubStrWithOutRepeat {

	public static void main(String[] args) {
		String s="abcabcbb";
		String str=" ";
		for(int i=0;i<s.length();i++) {
			if(str.indexOf(s.charAt(i))==-1) {
				str+=s.charAt(i);
			}
		}
		System.out.println(str);
		
	}

}
