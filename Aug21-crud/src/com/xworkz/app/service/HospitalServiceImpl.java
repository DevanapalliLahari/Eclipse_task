package com.xworkz.app.service;

import com.xworkz.app.DTO.HospitalDTO;

import com.xworkz.app.repository.HospitalRepository;
import com.xworkz.app.repository.HospitalRepositoryImpl;
import com.xworkz.app.util.ValidationUtil;

public class HospitalServiceImpl implements HospitalService {
	
	private HospitalRepository hospitalRepository=new HospitalRepositoryImpl();

	@Override
	public boolean validateAndSave(HospitalDTO hospitalDTO) {
		
		if(hospitalDTO!=null)
		{
			System.out.println("Valid data,can save..");
			System.out.println("Args passed :" +hospitalDTO);
			String name=hospitalDTO.getName();
			String location=hospitalDTO.getLocation();
			int noOfDoctors=hospitalDTO.getNoOfDoctors();
			String doctorName=hospitalDTO.getDoctorName();
			
			if(ValidationUtil.validateString(name))
			{
				System.out.println("Name is Valid...");
			}
			else
			{
				System.err.println("Name is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateString(location))
			{
				System.out.println("location is Valid...");
			}
			else
			{
				System.err.println("location is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateInt(noOfDoctors))
			{
				System.out.println("Doctors is Valid...");
			}
			else
			{
				System.err.println("Doctors is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateString(doctorName))
			{
				System.out.println("Beds is Valid...");
			}
			else
			{
				System.err.println("Beds is Invalid...");
				return false;
			}
			System.out.println("All the data of the Hospital is Valid...");
			
			hospitalRepository.save(hospitalDTO);
			return true;
			
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}
		return false;
	}

	@Override
	public HospitalDTO findByName(String name) {
		boolean isValid=ValidationUtil.validateString(name);
		
		if(isValid)
		{
			System.out.println("Name is Valid..");
			HospitalDTO isFound= hospitalRepository.findByName(name);
			return isFound;
		}
		
	
			System.err.println("Name is Invalid");
		
		return null;
		
	}

	@Override
	public HospitalDTO findByNameAndNoOfDoctors(String name, int noOfDoctors) {
		boolean isValid=ValidationUtil.validateString(name)&& ValidationUtil.validateInt(noOfDoctors);
		if(isValid)
		{
			System.out.println("Name and Doctors Valid");
			HospitalDTO isFound=hospitalRepository.findByNameAndNoOfDoctors(name, noOfDoctors);
			return isFound;
		}
		System.err.println("Name and Doctors Invalid");
		return null;
	}

}