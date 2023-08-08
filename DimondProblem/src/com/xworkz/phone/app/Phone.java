package com.xworkz.phone.app;

public interface Phone {
	void number();
	default void charge()
	{
		System.out.println("The phomne as charger");
	}
}
