package com.xworkz.app.service;

import com.xworkz.app.DTO.HospitalDTO;

public interface HospitalService {

	boolean validateAndSave(HospitalDTO hospitalDTO);
	
	HospitalDTO findByName(String name);
	
	HospitalDTO findByNameAndNoOfDoctors(String name,int noOfDoctors);
}
