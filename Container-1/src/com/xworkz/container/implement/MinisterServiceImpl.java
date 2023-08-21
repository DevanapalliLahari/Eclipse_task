package com.xworkz.container.implement;

import com.xworkz.container.DTO.MinisterDTO;

import com.xworkz.container.service.MinisterService;

public class MinisterServiceImpl implements MinisterService {

	@Override
	public void validateAndSave(MinisterDTO ministerDTO) {

		System.out.println("Invoking the data:" + ministerDTO);

		if (ministerDTO != null) {
			System.out.println("validate data save");
			System.out.println("valid data:" + ministerDTO);

			String name = ministerDTO.getName();
			int exp = ministerDTO.getExp();
			String designation = ministerDTO.getDesignation();
			String partyName = ministerDTO.getPartyName();
		

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("The name of the minister is validate:" + name);

		} else {
			System.err.println("The name of the minister is not validate:" + name);
		}
		if (exp > 0 && exp < 30) {
			System.out.println("The exp of the minister is validate" + exp);
		} else {
			System.err.println("The exp of the minister is not validate" + exp);
		}

		if (designation != null && !designation.isEmpty() && designation.length() > 3 && designation.length() < 20) {
			System.out.println("The designation of the minister is validate:" + designation);

		} else {
			System.err.println("The designation of the minister is not validate:" + designation);
		}
		if (partyName != null && !partyName.isEmpty() && partyName.length() > 3 && partyName.length() < 20) {
			System.out.println("The party name of the minister is validate:" + partyName);
		} 
		
		else {
			System.err.println("The party name of the minister is not validate:" + partyName);
		}
		}
	}

}
