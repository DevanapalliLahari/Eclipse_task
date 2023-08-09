package com.xworkz.printing.runner;

import com.xworkz.printing.app.PrintingMachine;
import com.xworkz.printing.implement.DigitalPrintingMachine;
import com.xworkz.printing.user.Rasmika;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		PrintingMachine machine = new DigitalPrintingMachine();
		machine.work();
		System.out.println(PrintingMachine.PRICE);
		Rasmika rasmika = new Rasmika(machine);
		rasmika.print();

	}

}
