package com.xworkz.printing.implement;

import com.xworkz.printing.app.WaterPurifier;

public class KentWaterPurifier implements WaterPurifier{

	@Override
	public void filter() {
		System.out.println("Invoking water purifier in kent water purifier");
	}

}
