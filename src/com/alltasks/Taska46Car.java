package com.alltasks;

public class Taska46Car implements VehicleInterface {
	static boolean found=false;
	@Override
	public void start(String bname) {
	 found=true;
	System.out.println("car brand "+bname);
	 System.out.println("car started with key");
	}
	public void stop() {
		if(found) {
		System.out.println("car stooped");
		}
		else {
			System.out.println("car isn't even started");
		}
	}


	public static void main(String[] args) {
		Taska46Car car= new Taska46Car();
		car.start("Suzukii");
		car.stop();
		  

	}

	 
}
