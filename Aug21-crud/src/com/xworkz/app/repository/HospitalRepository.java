package com.xworkz.app.repository;

import com.xworkz.app.DTO.HospitalDTO;

public interface HospitalRepository {
	
	int TOTAL_VALUES=3;
	int index=0;

	public void save(HospitalDTO hospitalDTO);

public HospitalDTO findByName(String name) ;
HospitalDTO findByNameAndNoOfDoctors(String name,int noOfDoctors);

}
