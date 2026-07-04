package com.java8Features;

import java.util.function.Supplier;

//WAP generate otp with 6 digits
public class Demo7 {

	public static void main(String[] args) {
		
		Supplier<String> s1= () -> {
			String otp="";
			
			for(int i=0;i<=6;i++) {
				otp=otp + (int)(Math.random()*10);// math.random value >=0.0  and < 1-0
			}
			return otp;
		};
		System.out.println(s1.get());
	}

}
