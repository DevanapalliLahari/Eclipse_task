package com.xworkz.chocolate.runner;

import com.xworkz.chocolate.app.Chocolate;
import com.xworkz.chocolate.app.DairyMilkChocolate;
import com.xworkz.chocolate.app.EclairsChocolate;
import com.xworkz.chocolate.app.MunchChocolate;

public class ChocolateRunner {
	public static void main(String[] args) {
		Chocolate chocolate = new MunchChocolate();
		chocolate.fat();
		chocolate.minerals();

		DairyMilkChocolate dmc = new MunchChocolate();
		dmc.fat();
		dmc.minerals();
		dmc.proteins();

		EclairsChocolate ec = new MunchChocolate();
		ec.fat();
		ec.sweet();
		ec.minerals();
		ec.minerals();
	}

}


