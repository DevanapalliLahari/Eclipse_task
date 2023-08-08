package com.xworkz.chocolate.app;

public interface Chocolate {
	void fat(); 
	

	default void minerals() {
		System.out.println("The chocolate is stress buster");
	}
}
