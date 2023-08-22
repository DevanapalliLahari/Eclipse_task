package com.xworkz.app.repository;

import com.xworkz.app.DTO.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {
	HospitalDTO[] hospital = new HospitalDTO[TOTAL_VALUES];
	int index = 0;

	@Override
	public void save(HospitalDTO hospitalDTO) {
		if (index < TOTAL_VALUES) {
			System.out.println("Invoking data into HospitalRepositoryImpl");
			this.hospital[index] = hospitalDTO;
			System.out.println("The index of the element is:" + index);
		} else {
			System.out.println("we con't store the data,array  is full");
		}
	}

}
