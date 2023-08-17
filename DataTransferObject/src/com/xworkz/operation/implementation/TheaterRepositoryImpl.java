package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.TheaterDTO;
import com.xworkz.operation.repository.TheaterRepository;

public class TheaterRepositoryImpl implements TheaterRepository {
TheaterDTO [] theater=new TheaterDTO[TOTAL_DATA];
int index=0;

@Override
	public void save(TheaterDTO theaterDTO) {
    System.out.println("invoking the data of the theater"+theaterDTO);
    if(index<TOTAL_DATA)
    {
    	this.theater[index]=theaterDTO;
    	index++;
    	System.out.println("invoking the  data");
    }
    else
    {
    	System.out.println("we con't store,the array is full");
    }
	}
}
