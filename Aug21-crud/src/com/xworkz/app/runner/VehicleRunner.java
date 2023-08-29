package com.xworkz.app.runner;

import java.time.LocalDate;

import com.xworkz.app.DTO.AbstractDTO;
import com.xworkz.app.DTO.VehicleDTO;

public class VehicleRunner {

	public static void main(String[] args) {
	AbstractDTO dTO=new VehicleDTO();
	dTO.setWhenCreated(LocalDate.now());
	dTO.setWhenUpdated(LocalDate.now());
	dTO.setWhoCreated("Ram");
	dTO.setWhoUpdated("Sam");
	System.out.println(dTO);
  
   
	}

}
