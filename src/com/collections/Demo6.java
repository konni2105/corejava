package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo6 {

	public static void main(String[] args) {
		Collection<String> veg=new ArrayList<>();
		
//		veg.add("carrot");
//		veg.add("potato");
//		veg.add("cabbage");
		
	//	veg.add(null);
		if(veg.isEmpty()) {
			veg.add("bendi");
			veg.add("beera");
			
		}
		System.out.println(veg);
		

	}

}
