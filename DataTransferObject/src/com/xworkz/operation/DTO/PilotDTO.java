package com.xworkz.operation.DTO;

import java.io.Serializable;

public class PilotDTO implements Serializable{
private String name;
private int  salary;
private String location;
private int age;
private double height;

public PilotDTO()
{
	System.out.println("Invoking the no-argument cons of pilot DTO");
}

public PilotDTO(String name, int salary, String location, int age, double height) {
	super();
	this.name = name;
	this.salary = salary;
	this.location = location;
	this.age = age;
	this.height = height;
}

public String getName() {
	return name;
}

public int getSalary() {
	return salary;
}

public String getLocation() {
	return location;
}

public int getAge() {
	return age;
}

public double getHeight() {
	return height;
}

public void setName(String name) {
	this.name = name;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public void setLocation(String location) {
	this.location = location;
}

public void setAge(int age) {
	this.age = age;
}

public void setHeight(double height) {
	this.height = height;
}

@Override
public String toString() {
	return "PilotDTO [name=" + name + ", salary=" + salary + ", location=" + location + ", age=" + age + ", height="
			+ height + "]";
}
}
