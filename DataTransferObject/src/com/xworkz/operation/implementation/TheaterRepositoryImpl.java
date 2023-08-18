package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.TheaterDTO;
import com.xworkz.operation.repository.TheaterRepository;

public class TheaterRepositoryImpl implements TheaterRepository {
TheaterDTO [] theater=new TheaterDTO[TOTAL_DATA];
int index=0;

@Override
	public void save(TheaterDTO theaterDTO) {
    System.out.println("invoking the data of the theater"+index +"is :"+theaterDTO);
    if(index<TOTAL_DATA)
    {
    	this.theater[index]=theaterDTO;
    	index++;
    	System.out.println("invoking the  data"+index);
    }
    else
    {
    	System.out.println("we con't store,the array is full");
    }
	}

@Override
public TheaterDTO findByName(String name) {
	System.out.println("finding the data using name:"+name);
	for(index=0;index<theater.length;index++)
	{
		if(theater[index].getName()==name)
		{
			index++;
			System.out.println("invoking the data");
			return theater[index];
		}
	}
	System.out.println("we con't store, array is full");
	return null;
}

@Override
public TheaterDTO findByFilmName(String filmName) {
	System.out.println("Finding the data  using film name:"+filmName);
	for(index=0;index<theater.length;index++)
	{
		if(theater[index].getFilmName()==filmName)
		{
			index++;
			System.out.println("invoking the data");
			return theater[index];
		}
	}
	System.out.println("we con't store, array is full");
	return null;
}

@Override
public TheaterDTO findByCapacity(int capacity) {
	System.out.println("Finding the data  using film name:"+capacity);
	for(index=0;index<theater.length;index++)
	{
		if(theater[index].getCapacity()==capacity)
		{
			index++;
			System.out.println("invoking the data");
			return theater[index];
		}
	}
	System.out.println("we con't store, array is full");
	return null;
}

@Override
public TheaterDTO[] readAll() {
	return theater;
}
}
