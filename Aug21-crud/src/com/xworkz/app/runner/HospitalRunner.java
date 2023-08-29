package com.xworkz.app.runner;

import com.xworkz.app.DTO.HospitalDTO;
import com.xworkz.app.service.HospitalService;
import com.xworkz.app.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalDTO hospitalDTO = new HospitalDTO("Usmaniya", "Hyderabad", "Prasad", 10000);

		HospitalService hospitalService = new HospitalServiceImpl();
		boolean service = hospitalService.validateAndSave(hospitalDTO);
		if (service) {
			System.out.println("Saved :" + service);
		} else {
			System.out.println("Do not saved :" + service);
		}
		HospitalDTO name = hospitalService.findByName("Usmaniya");
		System.out.println(name);
		
		HospitalDTO nameAndNoofDoctors = hospitalService.findByNameAndNoOfDoctors("Usmaniya", 10000);
		System.out.println(nameAndNoofDoctors);
	}
}
