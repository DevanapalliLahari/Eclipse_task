package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.MetroStaffDTO;
import com.xworkz.operation.DTO.PilotDTO;
import com.xworkz.operation.implementation.PilotRepositoryImpl;
import com.xworkz.operation.repository.PilotRepository;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		PilotDTO pilot = new PilotDTO("Rajan", 50000, "Bangloore", 29, 5.2);

		PilotDTO pilot1 = new PilotDTO("Subha", 60000, "Hyderabad", 27, 5.3);

		PilotDTO pilot2 = new PilotDTO("Santhoosh", 70000, "Mumbai", 30, 5.5);

		PilotDTO pilot3 = new PilotDTO("Anjali", 50000, "Chennai", 28, 5.8);

		PilotDTO pilot4 = new PilotDTO("Sobhan", 60000, "Delhi", 26, 5.11);

		PilotRepository repository = new PilotRepositoryImpl();
		repository.save(pilot);

		repository.save(pilot1);

		repository.save(pilot2);

		repository.save(pilot3);

		repository.save(pilot4);

		PilotDTO dTO = repository.findByName("Subha");
		System.out.println(dTO);
		PilotDTO dTO1 = repository.findByLocation("Mumbai");
		System.out.println(dTO1);

		PilotDTO dTO2 = repository.findByAge(28);
		System.out.println(dTO2);

		PilotDTO[] dTO3 = repository.readAll();
		{
			for (int index = 0; index < dTO3.length; index++) {
				if (dTO3[index] != null) {
					System.out.println(dTO3[index]);
				}
			}
		}

	}

}
