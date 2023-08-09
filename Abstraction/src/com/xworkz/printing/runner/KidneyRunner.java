package com.xworkz.printing.runner;

import com.xworkz.printing.app.Kidney;
import com.xworkz.printing.implement.HumanKidney;
import com.xworkz.printing.user.Doctor;

public class KidneyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main");
		Kidney kidney = new HumanKidney();
		kidney.purify();
		System.out.println(kidney.NO_OF_KIDNEYS);
		Doctor doctor = new Doctor(kidney);
		doctor.clean();
	}

}
