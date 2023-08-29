package com.xworkz.app.service;

import com.xworkz.app.DTO.MovieDTO;

public interface MovieService {

	
	
	public MovieDTO findByName(String name);
	public MovieDTO findByNameAndNoOfReels(String name, int noOfReels);

	boolean validateAndSave(MovieDTO movieDTO);
}
