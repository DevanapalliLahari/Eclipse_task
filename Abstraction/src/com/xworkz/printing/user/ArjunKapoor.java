package com.xworkz.printing.user;

import com.xworkz.printing.app.WashingMachine;

public class ArjunKapoor {
	private WashingMachine clean;
	public ArjunKapoor(WashingMachine clean)
	{
		System.out.println("Arjun Kapoor is cleaning clothes");
		this.clean=clean;
	}
	public void wash()
	{
		if(clean!=null)
		{
			System.out.println("Machine is working,start cleaning");
			this.clean.dry();
		}
		else
		{
			System.err.println("Machine is not working,stop cleaning");
		}
	}
	}


