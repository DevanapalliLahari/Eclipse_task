package com.xworkz.printing.user;

import com.xworkz.printing.app.Kidney;

public class Doctor {
public Kidney type;
public Doctor(Kidney type)
{
	System.out.println("Invoking kidney parameterized cons of doctor");
	this.type=type;
}
public void clean()
{
	if(type!=null)
	{
		System.out.println("start working");
		this.type.purify();
	}
	else
	{
		System.err.println("stop working");
	}
}
}
