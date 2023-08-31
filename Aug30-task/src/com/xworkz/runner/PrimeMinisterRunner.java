package com.xworkz.runner;

import com.xworkz.DTO.PrimeMinisterDTO;
import com.xworkz.service.PrimeMinisterService;
import com.xworkz.service.PrimeMinisterServiceImpl;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		PrimeMinisterDTO dto = new PrimeMinisterDTO("Narendra Modi", 2, "India", "Bharathiya Janatha Party");
		PrimeMinisterService service = new PrimeMinisterServiceImpl();
		boolean data = service.validateAndSave(dto);
		if (data) {
			System.out.println("Saved :" + data);
			System.out.println("Do not saved :" + data);
		}
		PrimeMinisterDTO name1 = service.findByName("Narendra Modi");
		System.out.println(name1);
	}

}
