package com.xworkz.app.service;

import com.xworkz.app.DTO.MovieDTO;
import com.xworkz.app.repository.MovieRepository;
import com.xworkz.app.repository.MovieRepositoryImpl;
import com.xworkz.app.util.ValidUtil;

public class MovieServiceImpl implements MovieService {

	@Override
	public boolean validAndSave(MovieDTO movieDTO) {
		if (movieDTO != null) {
			System.out.println("the data is valid");
			System.out.println("Arg passed:" + movieDTO);
			String name = movieDTO.getName();
			String heroName = movieDTO.getHeroName();
			String category = movieDTO.getCategory();
			int noOfReels = movieDTO.getNoOfReels();
			if (ValidUtil.validateString(name)) {
				System.out.println("The name is validate:" + name);
			} else {
				System.out.println("The name is not validate:" + name);
				return false;
			}
			if (ValidUtil.validateString(heroName)) {
				System.out.println("The hero name is validate:" + heroName);
			} else {
				System.out.println("The hero name is not validate:" + heroName);
				return false;
			}
			if (ValidUtil.validateString(category)) {
				System.out.println("The category is validate:" + category);
			} else {
				System.out.println("The category is not validate:" + category);
				return false;
			}
			if (noOfReels > 0 && noOfReels < 100000) {
				System.out.println("noOfReels is  validate" + noOfReels);
			} else {
				System.out.println("noOfReels is not validate" + noOfReels);
				return false;
			}
			System.out.println("All the data of movie is valid");
			MovieRepository dto = new MovieRepositoryImpl();
			dto.save(movieDTO);
			return true;
		} else {
			System.out.println("invalid data we con't store");
		}
		return false;
	}

}
