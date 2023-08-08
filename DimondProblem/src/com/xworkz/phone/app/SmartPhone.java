package com.xworkz.phone.app;

public interface SmartPhone extends Phone{
	@Override
	void number();
	default void network()
	{
		System.out.println("The network is bad  in villages");
	}

}
