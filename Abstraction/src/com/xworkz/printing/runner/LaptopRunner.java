package com.xworkz.printing.runner;

import com.xworkz.printing.app.Laptop;
import com.xworkz.printing.implement.DellLaptop;
import com.xworkz.printing.user.Mrunal;
import com.xworkz.printing.user.SharukKhan;

public class LaptopRunner {
	public static void main(String[] args) {
		System.out.println("Running main");
		Laptop lap = new DellLaptop();
		lap.execution();
		System.out.println(lap.NAME);
		Mrunal mrunal = new Mrunal(lap);
		mrunal.display();

	}
}
