package com.xworkz.app.repository;

import com.xworkz.app.DTO.WasteDTO;

public class WasteRepositoryImpl implements WasteRepository{
	
		WasteDTO[] dtos = new WasteDTO[TOTAL_VALUES];
		int index = 0;

		@Override
		public void save(WasteDTO wasteDTO) {
			if (index < TOTAL_VALUES) {
				System.out.println("invoking the data:" + wasteDTO);
				this.dtos[index] = wasteDTO;
				System.out.println("The index of the data is:" + index);
				index++;
			} else {
				System.err.println("The is con't store array is full");
			}
		}
	}
	
	
