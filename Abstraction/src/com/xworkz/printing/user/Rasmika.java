package com.xworkz.printing.user;

import com.xworkz.printing.app.PrintingMachine;

public class Rasmika {

	private PrintingMachine printing;

	public Rasmika(PrintingMachine printing){
		this.printing=printing;
		System.out.println("Invoking the printing machine of rasmika");
	}
	public void print ()
	{
	if(printing!=null){
		System.out.println("Start printing");
		this.printing.work();
	}
	else
	{
		System.err.println("Stop Printing");
	}
	}

}
