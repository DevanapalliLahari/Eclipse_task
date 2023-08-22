package com.xworkz.app.runner;

import com.xworkz.app.DTO.MovieDTO;
import com.xworkz.app.service.MovieService;
import com.xworkz.app.service.MovieServiceImpl;

public class MovieRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		MovieDTO dto = new MovieDTO("Mirchi", "Prabash", "Action", 24);

		MovieService movieService = new MovieServiceImpl();
		boolean movies = movieService.validAndSave(dto);
		if (movies) {
			System.out.println("Saved :" + movies);
		} else {
			System.out.println("Do not saved :" + movies);
		}

	}

}
