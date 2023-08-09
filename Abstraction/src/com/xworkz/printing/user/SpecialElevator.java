package com.xworkz.printing.user;

import com.xworkz.printing.app.Elevator;

public class SpecialElevator{
Elevator carry;
public SpecialElevator(Elevator carry)
{
	System.out.println("Invoking elevator parameterized cons of special elevator ");
	this.carry=carry;
}
public void carryLuggage()
{
	if(carry!=null)
	{
		System.out.println("Elevator is  working,start carry luggage");
		this.carry.move();
	}
	else
	{
		System.err.println("Elevator is not working,stop carry luggage");
	}
}
}
