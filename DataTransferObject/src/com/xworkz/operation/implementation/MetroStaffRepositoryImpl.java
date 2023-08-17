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
}