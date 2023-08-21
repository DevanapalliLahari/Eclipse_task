package com.xworkz.container.runner;

import com.xworkz.container.DTO.CookDTO;
import com.xworkz.container.implement.CookServiceImpl;
import com.xworkz.container.service.CookService;

public class CookRunner {

	public static void main(String[] args) {
		CookDTO dTO = new CookDTO("Byriyani", "7 Hills", "male", 25000);
		System.out.println((dTO));
		CookService cook = new CookServiceImpl();
		cook.validateAndSave(dTO);
	}

}
