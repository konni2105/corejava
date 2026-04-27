package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupliRemv {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(50);
		
	
		
		//using for
		for(int i=0;i<l.size();i++) {
			
			for(int j=i+1;j<l.size();j++) {
				
				if(l.get(i).equals(l.get(j))) {
					l.remove(j);
					j--;
					}
					
				}
				
			}
		System.out.println("without dupli:"+l);
		
		
		//using foreach
		
		List<String>l1=new ArrayList(Arrays.asList("app","man","app","ban"));
		List<String> result=new ArrayList<>();
		
		for(String s:l1) {
			if(!result.contains(s)) {
				result.add(s);
			}
		}
		System.out.println("without dupli"+result);
		}
		
	}


