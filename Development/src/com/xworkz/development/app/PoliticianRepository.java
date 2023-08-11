package com.xworkz.development.app;

public interface PoliticianRepository {
	int TOTAL_ITEMS = 5;

	void save(String name);

	default void display() {
		System.out.println("Invoking the elements");
	}
}
