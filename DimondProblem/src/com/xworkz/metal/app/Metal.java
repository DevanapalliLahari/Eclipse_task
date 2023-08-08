package com.xworkz.metal.app;

public interface Metal {
	void strong();
	default void badConductivity()
	{
		System.out.println("The iron is Bad conductivity for fire");
	}
}
