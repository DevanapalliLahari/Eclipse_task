package com.xworkz.development.app;

public interface OlympicRepository {
int TOTAL_YEARS=5;

void save(int year);

default void display()
{
	System.out.println("Invoking the Elements");
}
}
