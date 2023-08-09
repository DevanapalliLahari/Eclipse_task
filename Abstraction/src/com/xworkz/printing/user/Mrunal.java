package com.xworkz.printing.user;

import com.xworkz.printing.app.Laptop;

public class Mrunal {
private Laptop type;
public Mrunal(Laptop type)
{
	System.out.println("Invoking laptop parameterized cons of Mrunal ");
	this.type=type;
}
public void display()
{
	if(type!=null)
	{
		System.out.println("Laptop is  working,start display");
		this.type.execution();
	}
	else
	{
		System.err.println("Laptop is not working,stop display");
	}
}
}
