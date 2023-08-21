package com.xworkz.container.runner;

import com.xworkz.container.DTO.MechanicDTO;
import com.xworkz.container.implement.MechanicServiceImpl;
import com.xworkz.container.service.MechanicService;

public class MechanicRunner {

	public static void main(String[] args) {
System.out.println("Running main");
MechanicDTO dTO=new MechanicDTO("Genatha Garege","22AAAAAOOOOA1Z5","Engine Part", 1000);
System.out.println(dTO);

MechanicService service=new MechanicServiceImpl();
service.validateAndSave(dTO);
	}

}
