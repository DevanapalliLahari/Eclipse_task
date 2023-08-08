package com.xworkz.metal.runner;
import com.xworkz.metal.app.GoldMetal;
import com.xworkz.metal.app.Metal;
import com.xworkz.metal.app.PlatinumMetal;
import com.xworkz.metal.app.SteelMetal;

public class MetalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main ");
		GoldMetal metal = new PlatinumMetal();
		metal.badConductivity();
		metal.precious();
		metal.price();
		metal.strong();

		SteelMetal metal1 = new PlatinumMetal();
		metal1.badConductivity();
		metal1.price();
		metal1.strong();
		Metal metal2 = new PlatinumMetal();
		metal2.badConductivity();
		metal2.strong();
	}

}


