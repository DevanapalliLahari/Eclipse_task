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

}
