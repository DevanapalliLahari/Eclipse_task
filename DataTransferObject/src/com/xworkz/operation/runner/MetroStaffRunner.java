package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.MarketDTO;
import com.xworkz.operation.DTO.MetroStaffDTO;
import com.xworkz.operation.implementation.MetroStaffRepositoryImpl;
import com.xworkz.operation.repository.MetroStaffRepository;

public class MetroStaffRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		MetroStaffDTO staff = new MetroStaffDTO("Ram", 450, "ram@gmail.com", "male", 25000);
		

		MetroStaffDTO staff1 = new MetroStaffDTO("john", 550, "john@gmail.com", "male", 24000);
		

		MetroStaffDTO staff2 = new MetroStaffDTO("mary", 450, "mary@gmail.com", "female", 26000);
		

		MetroStaffDTO staff3 = new MetroStaffDTO("Lahari", 350, "lahari@gmail.com", "female", 30000);
		

		MetroStaffDTO staff4 = new MetroStaffDTO("Bhanu", 250, "bhanu@gmail.com", "female", 25000);
		
		MetroStaffRepository repository = new MetroStaffRepositoryImpl();
		repository.save(staff);
		
		repository.save(staff1);
		
		repository.save(staff2);
		
		repository.save(staff3);
		
		repository.save(staff4);
		
		MetroStaffDTO dTO = repository.findByName("Mary");
		System.out.println(dTO);

		MetroStaffDTO dTO1 = repository.findByNoOfStaff(350);
		System.out.println(dTO1);

		MetroStaffDTO dTO2 = repository.findByGender("Male");
		System.out.println(dTO2);

		MetroStaffDTO[] dTO3 = repository.readAll();
		{
			for (int index = 0; index < dTO3.length; index++) {
				if (dTO3[index] != null) {
					System.out.println(dTO3[index]);
				}
			}
		}

	}

}
