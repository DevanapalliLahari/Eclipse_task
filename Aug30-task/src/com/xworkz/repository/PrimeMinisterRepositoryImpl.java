package com.xworkz.repository;

import com.xworkz.DTO.PrimeMinisterDTO;

public class PrimeMinisterRepositoryImpl implements PrimeMinisterRepository {
	PrimeMinisterDTO[] dtos = new PrimeMinisterDTO[TOTAL_VALUES];
	int index = 0;

	@Override
	public void save(PrimeMinisterDTO ministerDTO) {
		if (index < TOTAL_VALUES) {
			System.out.println("invoking the data:" + ministerDTO);
			this.dtos[index] = ministerDTO;
			System.out.println("The index of the data is:" + index);
			index++;
		} else {
			System.err.println("The is con't store array is full");
		}
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		for (int pos = 0; pos < index; pos++) {
			if (dtos[pos].getName().equals(name)) {
				System.out.println("the data is found:" + name);
				return dtos[pos];
			}
			System.out.println("the next index is:" + index);
		}
		System.out.println("name not found:" + name);
		return null;

		
	}

}
