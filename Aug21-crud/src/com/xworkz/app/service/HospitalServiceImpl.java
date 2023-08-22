package com.xworkz.app.service;

import com.xworkz.app.DTO.HospitalDTO;
import com.xworkz.app.repository.HospitalRepository;
import com.xworkz.app.repository.HospitalRepositoryImpl;
import com.xworkz.app.util.ValidationUtil;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean validateAndSave(HospitalDTO hospitalDTO) {
		if(hospitalDTO!=null)
		{
			System.out.println("Data valid,can save");
			System.out.println("Args passed:"+hospitalDTO);
			String name=hospitalDTO.getName();
			String location=hospitalDTO.getLocation();
			String doctorName=hospitalDTO.getDoctorName();
			int noOfDoctors=hospitalDTO.getNoOfDoctors();
			if(ValidationUtil.validateString(name))
			{
				System.out.println("name is valid"+name);
			}
			else
			{
				System.out.println("name is not valid"+name);
				return false;
			}
			if(ValidationUtil.validateString(location))
			{
				System.out.println("location is validate"+location);
			}
			else
			{
				System.out.println("Location is not validate"+location);
				return false;
			}
			if(ValidationUtil.validateString(doctorName))
			{
				System.out.println("Doctor name is valid"+doctorName);
			}
			else
			{
				System.out.println("Doctor name is not validate"+doctorName);
				return false;
			}
			if(noOfDoctors>0&& noOfDoctors<100000)
			{
				System.out.println("noOfDoctors is  validate"+noOfDoctors);
			}
			else
			{
				System.out.println("noOfDoctors is not validate"+noOfDoctors);
				return false;
			}
			System.out.println("All the data of the Hospital is Valid...");
			HospitalRepository hospitalRepository=new HospitalRepositoryImpl();
			hospitalRepository.save(hospitalDTO);
			return true;
		}
		else {
			System.out.println("invalid data we con't store");
		}
		return false;
		
	}

}
