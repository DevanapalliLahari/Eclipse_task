package com.xworkz.service;

import com.xworkz.DTO.PrimeMinisterDTO;

public interface PrimeMinisterService {

	public boolean validateAndSave(PrimeMinisterDTO ministerDTO);
	
	public PrimeMinisterDTO findByName(String name);
}
