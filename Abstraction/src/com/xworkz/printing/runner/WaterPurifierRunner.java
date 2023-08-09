package com.xworkz.printing.runner;

import com.xworkz.printing.app.WaterPurifier;
import com.xworkz.printing.implement.KentWaterPurifier;
import com.xworkz.printing.user.HemamaliniWaterPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main");
		WaterPurifier waterPurifier = new KentWaterPurifier();
		waterPurifier.filter();
		System.out.println(waterPurifier.PRICE);
		HemamaliniWaterPurifier malini = new HemamaliniWaterPurifier(waterPurifier);
		malini.purify();
	}

}
