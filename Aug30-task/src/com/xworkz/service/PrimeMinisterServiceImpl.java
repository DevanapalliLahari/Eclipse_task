package com.xworkz.service;

import com.xworkz.DTO.PrimeMinisterDTO;
import com.xworkz.repository.PrimeMinisterRepository;
import com.xworkz.repository.PrimeMinisterRepositoryImpl;
import com.xworkz.util.ValidUtil;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	PrimeMinisterRepository ministerRepository = new PrimeMinisterRepositoryImpl();
	
	
	@Override
	public boolean validateAndSave(PrimeMinisterDTO ministerDTO) {
		if (ministerDTO != null) {
			System.out.println("The data of the PrimeMinister is:" + ministerDTO);
			String name = ministerDTO.getName();
			int id = ministerDTO.getId();
			String countryName = ministerDTO.getCountryName();
			String partyName = ministerDTO.getPartyName();
			
			if (ValidUtil.validString(name)) {
				System.out.println("The name and id is valid:" + name);
				
			} else {
				System.out.println("The name is not valid:" + name);
				return false;
			}

			if (ValidUtil.validInt(id)) {
				System.out.println("The  id is valid:" + id);
				

			} else {
				System.out.println("The id is not valid:" + id);
				return false;

			}

			if (ValidUtil.validString(countryName)) {
				System.out.println("The country name is valid:" + countryName);
				
			} else {
				System.out.println("The country name is not valid:" + countryName);
				return false;
			}

			if (ValidUtil.validString(partyName)) {
				System.out.println("The party name is valid:" + partyName);
			
			} else {
				System.out.println("The party name is not valid:" + partyName);
				return false;
			}
			ministerRepository.save(ministerDTO);
			return true;
		}
       System.err.println("The data is wrong");
		return false;

	}
@Override
	public PrimeMinisterDTO findByName(String name) {
		boolean isValid = ValidUtil.validString(name);
		if (isValid) {
			System.out.println("The name is valid:" + name);
			PrimeMinisterDTO isFound = ministerRepository.findByName(name);
			return isFound;
		}
		System.err.println("Name not found:" + name);
		return null;
	}

}
