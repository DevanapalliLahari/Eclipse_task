package com.xworkz.chocolate.app;

public interface DairyMilkChocolate extends Chocolate {
	@Override
	void fat();

	default void proteins() {
     System.out.println("Chocolate haas lot of proteins");

}
}