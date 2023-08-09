package com.xworkz.printing.implement;

import com.xworkz.printing.app.Elevator;

public class PeopleElevator implements Elevator {

	@Override
	public void move() {
		System.out.println("Invoking move in elevator");
	}
}