package com.xworkz.container.runner;

import com.xworkz.container.DTO.CeoDTO;
import com.xworkz.container.implement.CeoServiceImpl;
import com.xworkz.container.service.CeoService;

public class CeoRunner {

	public static void main(String[] args) {
		System.out.println("running main");
		CeoDTO dTO = new CeoDTO("Sundar pichai", "google", 1663412500, 19);
		System.out.println(dTO);
		CeoService ceo = new CeoServiceImpl();
		ceo.validateAndSave(dTO);

	}

}
