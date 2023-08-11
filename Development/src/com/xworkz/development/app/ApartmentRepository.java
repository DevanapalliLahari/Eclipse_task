package com.xworkz.development.app;

public interface ApartmentRepository {
int TOTAL_ITEMS=5;
public void save(String name);
default void display()
{
	System.out.println(" display ");
}
}
