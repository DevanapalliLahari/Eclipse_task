package com.xworkz.printing.runner;

import com.xworkz.printing.app.WashingMachine;
import com.xworkz.printing.implement.SamsungWashingMachine;
import com.xworkz.printing.user.ArjunKapoor;

public class WashingMachineRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		WashingMachine machine = new SamsungWashingMachine();
		machine.dry();
		System.out.println(machine.Total_ITEMS);
		ArjunKapoor kapoor = new ArjunKapoor(machine);
		kapoor.wash();

	}

}
