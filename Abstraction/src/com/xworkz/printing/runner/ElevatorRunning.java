package com.xworkz.printing.runner;

import com.xworkz.printing.app.Elevator;
import com.xworkz.printing.implement.PeopleElevator;
import com.xworkz.printing.user.SpecialElevator;

public class ElevatorRunning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("runnning main");
		Elevator elevator = new PeopleElevator();
		elevator.move();
		System.out.println(elevator.NAME);
		SpecialElevator special = new SpecialElevator(elevator);
		special.carryLuggage();
	}

}
