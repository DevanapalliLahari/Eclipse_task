package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.MetroStaffDTO;
import com.xworkz.operation.repository.MetroStaffRepository;

public class MetroStaffRepositoryImpl implements MetroStaffRepository {
	MetroStaffDTO[] staff = new MetroStaffDTO[TOTAL_DATA];
	int index = 0;

	@Override
	public void save(MetroStaffDTO metroStaffDTO) {
		System.out.println("invoking the metro Staff data:"  + metroStaffDTO);
		if (index < TOTAL_DATA) {
			this.staff[index] = metroStaffDTO;
			index++;
			System.out.println("Invoking the data");
		} else {
			System.out.println("we con't store the data, array is full");
		}

	}

	@Override
	public MetroStaffDTO findByName(String name) {
		System.out.println(" Invoking the  data of customer: " + name);
		for (index = 0; index < staff.length; index++) {
			if (staff[index].getStaffName() == name) {
				index++;
				System.out.println("Invoking the data");
				return staff[index];
			}
		}
		System.out.println("The data con't be stored,  the array  is full");
		return null;
	}

	@Override
	public MetroStaffDTO findByNoOfStaff(int noOfStaff) {
		System.out.println(" Invoking the  data of customer: " + noOfStaff);
		for (index = 0; index < staff.length; index++) {
			if (staff[index].getNoOfStaff() == noOfStaff) {
				index++;
				System.out.println("Invoking the data");
				return staff[index];
			}
		}
		System.out.println("The data con't be stored,  the array  is full");
		return null;
	}

	@Override
	public MetroStaffDTO findByGender(String gender) {
		System.out.println(" Invoking the  data of customer: " + gender);
		for (index = 0; index < staff.length; index++) {
			if (staff[index].getGender() ==gender ) {
				index++;
				System.out.println("Invoking the data");
				return staff[index];
			}
		}
		System.out.println("The data con't be stored,  the array  is full");
		return null;
	}

	@Override
	public MetroStaffDTO[] readAll() {
		// TODO Auto-generated method stub
		return staff;
	}
}