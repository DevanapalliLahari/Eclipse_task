package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.MetroStaffDTO;
import com.xworkz.operation.implementation.MetroStaffRepositoryImpl;
import com.xworkz.operation.repository.MetroStaffRepository;

public class MetroStaffRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		MetroStaffDTO staff = new MetroStaffDTO("Ram", 450, "ram@gmail.com", "male", 25000);
		System.out.println(staff.toString());
		System.out.println();

		MetroStaffDTO staff1 = new MetroStaffDTO("john", 550, "john@gmail.com", "male", 24000);
		System.out.println(staff1.toString());
		System.out.println();

		MetroStaffDTO staff2 = new MetroStaffDTO("mary", 450, "mary@gmail.com", "female", 26000);
		System.out.println(staff2.toString());
		System.out.println();

		MetroStaffDTO staff3 = new MetroStaffDTO("Lahari", 350, "lahari@gmail.com", "female", 30000);
		System.out.println(staff3.toString());
		System.out.println();

		MetroStaffDTO staff4 = new MetroStaffDTO("Bhanu", 250, "bhanu@gmail.com", "female", 25000);
		System.out.println(staff4.toString());
		System.out.println();
		MetroStaffRepository repository = new MetroStaffRepositoryImpl();
		repository.save(staff);
		System.out.println();

		MetroStaffRepository repository1 = new MetroStaffRepositoryImpl();
		repository1.save(staff1);
		System.out.println();

		MetroStaffRepository repository2 = new MetroStaffRepositoryImpl();
		repository2.save(staff2);
		System.out.println();

		MetroStaffRepository repository3 = new MetroStaffRepositoryImpl();
		repository3.save(staff3);
		System.out.println();

		MetroStaffRepository repository4 = new MetroStaffRepositoryImpl();
		repository4.save(staff4);
		System.out.println();

	}

}
