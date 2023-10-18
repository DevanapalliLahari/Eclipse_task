package com.xworkz.app.service;

import com.xworkz.app.DTO.WasteDTO;
import com.xworkz.app.repository.WasteRepository;
import com.xworkz.app.repository.WasteRepositoryImpl;
import com.xworkz.app.util.ValidUtil;

public class WasteServiceImpl implements WasteService{
	WasteRepository wasteRepository=new WasteRepositoryImpl();

	public WasteServiceImpl(WasteRepository repository) {
		System.out.println("invoking the data");
	}

	@Override
	public boolean validateAndSave(WasteDTO wasteDTO) {
		
			
		if (wasteDTO != null) {
			System.out.println("The data of the PrimeMinister is:" + wasteDTO);
			String name = wasteDTO.getName();
			String type =wasteDTO.getType();
			double weight = wasteDTO.getWeight();
			
			
			if (ValidUtil.validString(name)) {
				System.out.println("The name and id is valid:" + name);
				
			} else {
				System.out.println("The name is not valid:" + name);
				return false;
			}

			if (ValidUtil.validString(type)) {
				System.out.println("The  id is valid:" + type);
				

			} else {
				System.out.println("The id is not valid:" + type);
				return false;

			}

			if (ValidUtil.validDouble(weight)) {
				System.out.println("The country name is valid:" + weight);
				
			} else {
				System.out.println("The country name is not valid:" + weight);
				return false;
			}

			
			wasteRepository.save(wasteDTO);
			return true;
		}
       System.err.println("The data is wrong");
		return false;

	}


	}


