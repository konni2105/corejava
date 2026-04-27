package com.alltasks;

public interface VehicleInterface{
	abstract void start(String bname);
	default void stop() {
		System.out.println("vehicle is stop");
	}

}
