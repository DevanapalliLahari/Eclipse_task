package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.PilotDTO;
import com.xworkz.operation.repository.PilotRepository;

public class PilotRepositoryImpl implements PilotRepository {
PilotDTO[] pilot=new PilotDTO[TOTAL_DATA];
int index=0;
	
	@Override
	public void save(PilotDTO pilotDTO) {
    System.out.println("Invoking the Pilot data:"+pilotDTO);
    if(index<TOTAL_DATA)
    {
    	this.pilot[index]=pilotDTO;
    	index++;
    	System.out.println("innvoking the data");
    }
    else
    {
    	System.err.println("we con't store the data,array is full");
    }
	}

	@Override
	public PilotDTO findByName(String name) {
		System.out.println(" Invoking the  data of customer: " + name);
		for (index = 0; index <pilot .length; index++) {
			if (pilot[index].getName() == name) {
				index++;
				System.out.println("Invoking the data");
				return pilot[index];
			}
		}
		System.out.println("The data con't be stored,  the array  is full");
		return null;
	}

	@Override
	public PilotDTO findByLocation(String location) {
		System.out.println("finding the data of the customer location"+location);
		for (index = 0; index < pilot.length; index++) {
			if (pilot[index].getLocation() == location) {
				System.out.println("invoking the data");
				return pilot[index];
			}

		}
		System.out.println("we con't store,array is full");
		return null;
	}

	@Override
	public PilotDTO findByAge(int age) {
		System.out.println("finding the data of the customer location"+age);
		for (index = 0; index < pilot.length; index++) {
			if (pilot[index].getAge() == age) {
				System.out.println("invoking the data");
				return pilot[index];
			}
			
		}
		System.out.println("we con't store,array is full");
		return null;
	}

	@Override
	public PilotDTO[] readAll() {
		// TODO Auto-generated method stub
		return pilot;
	}

}
