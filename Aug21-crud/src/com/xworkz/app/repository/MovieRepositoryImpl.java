package com.xworkz.app.repository;

import com.xworkz.app.DTO.MovieDTO;

public class MovieRepositoryImpl implements MovieRepository {

	MovieDTO[] movie = new MovieDTO[TOTAL_VALUES];
	int index = 0;

	@Override
	public void save(MovieDTO movieDTO) {
		if (index < TOTAL_VALUES) {
			System.out.println("Invoking data in to MovieRepositoryImpl");
			this.movie[index] = movieDTO;
			System.out.println("The index of the element is:" + index);
		} else {
			System.out.println("we con't store the data,array is full");
		}

	}

}
