package com.xworkz.printing.user;

import com.xworkz.printing.app.WaterPurifier;

public class HemamaliniWaterPurifier {
WaterPurifier water; 

public HemamaliniWaterPurifier(WaterPurifier water)
{
	System.out.println("Invoking WaterPurifier parameterized cons of Hemamalini water purifier");
	this.water=water;
}
public void purify()
{
	if(water!=null)
	{
		System.out.println("purifier is working,start purify");
		this.water.filter();
	}
	else
	{
		System.err.println("purifier is not working,stop purify");
	}
}
}
