package com.xworkz.metal.app;

public interface GoldMetal extends SteelMetal {
	@Override
	void strong();

	default void precious() {
		System.out.println("The gold is very precious material");
	}
}
