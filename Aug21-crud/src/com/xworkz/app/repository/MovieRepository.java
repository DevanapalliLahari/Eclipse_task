package com.xworkz.app.repository;

import com.xworkz.app.DTO.MovieDTO;

public interface MovieRepository {

	int TOTAL_VALUES = 3;

	public void save(MovieDTO moviedto);
	public MovieDTO findByName(String name);
	
	MovieDTO findByNameAndNoOfReels(String name, int noOfReels);
}
