package com.xworkz.app.repository;

import com.xworkz.app.DTO.HospitalDTO;
import com.xworkz.app.DTO.MovieDTO;

public class MovieRepositoryImpl implements MovieRepository {

	MovieDTO[] movie = new MovieDTO[TOTAL_VALUES];
	int index = 0;

	@Override
	public void save(MovieDTO movieDTO) {
		if(index<TOTAL_VALUES)
		{
			System.out.println("Invoking save method in HospitalRepositoryImpl");
			this.movie[index]=movieDTO;
			System.out.println("The element at index :" +index);
			index++;
		}
	
		else
		{
			System.err.println("Array is full,can't save..");
		}
	}
	@Override
	public MovieDTO findByName(String name) {
		for(int index=0;index<index;index++)
		{
			if(movie[index].getName().equalsIgnoreCase(name))
				{
					System.out.println("Found name");
					return movie[index];
				}
			System.out.println("Name is not matched,moving next index");
		}
		System.err.println("Name not Found");
		return null;
	}

	
	@Override
	public MovieDTO findByNameAndNoOfReels(String name, int noOfReels) {
		for(int index=0;index<index;index++)
		{
			if(movie[index].getName().equalsIgnoreCase(name) && movie[index].getNoOfReels()==(noOfReels))
			{
				System.out.println("Found name and Doctors");
				return movie[index];
			}
			System.out.println("Name and Doctors is not matched,moving next index");
		}
		System.err.println("Name and doctors is not found");
		return null;
	
	}
}



