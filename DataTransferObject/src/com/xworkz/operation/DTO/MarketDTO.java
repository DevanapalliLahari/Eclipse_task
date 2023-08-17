package com.xworkz.operation.DTO;

import java.io.Serializable;

public class MarketDTO implements Serializable{
private String name;
private String location;
private String type;
private int capacity;
private int noOfItems;

public MarketDTO()
{
	System.out.println("Invoking the no-args cons");
}

public MarketDTO(String name, String location, String type, int capacity, int noOfItems) {
	super();
	this.name = name;
	this.location = location;
	this.type = type;
	this.capacity = capacity;
	this.noOfItems = noOfItems;
}

public String getName() {
	return name;
}

public String getLocation() {
	return location;
}

public String getType() {
	return type;
}

public int getCapacity() {
	return capacity;
}

public int getNoOfItems() {
	return noOfItems;
}

public void setName(String name) {
	this.name = name;
}

public void setLocation(String location) {
	this.location = location;
}

public void setType(String type) {
	this.type = type;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public void setNoOfItems(int noOfItems) {
	this.noOfItems = noOfItems;
}

@Override
public String toString() {
	return "MarketDTO [name=" + name + ", location=" + location + ", type=" + type + ", capacity=" + capacity
			+ ", noOfItems=" + noOfItems + "]";
}

}
