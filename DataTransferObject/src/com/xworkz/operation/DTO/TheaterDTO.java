package com.xworkz.operation.DTO;

import java.io.Serializable;

public class TheaterDTO implements Serializable{
private String name;
private String FilmName;
private int capacity;
private int noOfAudience;
private double amount;

public TheaterDTO()
{
	System.out.println("invoking the no-args cons");
}

public TheaterDTO(String name, String filmName, int capacity, int noOfAudience, double amount) {
	super();
	this.name = name;
	FilmName = filmName;
	this.capacity = capacity;
	this.noOfAudience = noOfAudience;
	this.amount = amount;
}

public String getName() {
	return name;
}

public String getFilmName() {
	return FilmName;
}

public int getCapacity() {
	return capacity;
}

public int getNoOfAudience() {
	return noOfAudience;
}

public double getAmount() {
	return amount;
}

public void setName(String name) {
	this.name = name;
}

public void setFilmName(String filmName) {
	FilmName = filmName;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public void setNoOfAudience(int noOfAudience) {
	this.noOfAudience = noOfAudience;
}

public void setAmount(double amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "TheaterDTO [name=" + name + ", FilmName=" + FilmName + ", capacity=" + capacity + ", noOfAudience="
			+ noOfAudience + ", amount=" + amount + "]";
}

}
