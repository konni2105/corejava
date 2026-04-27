package com.alltasks;

public class Taska46Bike implements VehicleInterface {
	boolean found;

	public static void main(String[] args) {

	}

	@Override
	public void start(String bname) {
		found = true;
		System.out.println("bike name:"+bname);
		System.out.println("bike started with key ");
	}
	public void stop() {
		if(found) {
			System.out.println("bike stop");
		}
		else {
			System.out.println("even bike havent start with key");
		}
	}
	

}
