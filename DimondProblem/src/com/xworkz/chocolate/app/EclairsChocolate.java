package com.xworkz.chocolate.app;

public interface EclairsChocolate extends Chocolate {
	@Override
	void fat();

	default void sweet() {
     System.out.println("Chocolate haas lot of proteins");

}
}