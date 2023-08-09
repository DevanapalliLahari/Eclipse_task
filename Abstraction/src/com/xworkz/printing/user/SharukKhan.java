package com.xworkz.printing.user;

import com.xworkz.printing.app.Laptop;
import com.xworkz.printing.app.SmartWatch;

public class SharukKhan {
private SmartWatch name;

public SharukKhan(SmartWatch name)
{
	System.out.println("The smartphone price is high");
	this.name=name;
}
public void showTime()
{
	if(name!=null)
	{
		System.out.println("Working the smart Watch");
		this.name.time();
	}
	else
	{
		System.err.println("The smart watch is not working ");
	}
}

}
