package com.xworkz.metal.app;

public interface SteelMetal extends Metal{
	@Override
	void strong();
	default void price()
	{
		System.out.println("The silver price is better compared to gold");
	}
	}



