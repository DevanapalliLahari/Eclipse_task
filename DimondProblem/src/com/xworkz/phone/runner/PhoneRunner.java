package com.xworkz.phone.runner;
import com.xworkz.phone.app.IPhone;
import com.xworkz.phone.app.LandPhone;
import com.xworkz.phone.app.Phone;
import com.xworkz.phone.app.SmartPhone;

public class PhoneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new IPhone();
		phone.charge();
		phone.number();

		SmartPhone smart = new IPhone();
		smart.charge();
		smart.network();
		smart.number();

		LandPhone land = new IPhone();
		land.charge();
		land.network();
		land.number();
		land.portable();
	}

}



