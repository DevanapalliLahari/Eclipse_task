package com.xworkz.phone.app;

public interface LandPhone extends SmartPhone {
	@Override
	public void number();

	default void portable() {
		System.out.println("The land phone is not portable");
	}

}
