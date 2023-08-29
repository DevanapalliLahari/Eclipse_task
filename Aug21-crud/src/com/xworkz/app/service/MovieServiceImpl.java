package com.xworkz.app.service;

import com.xworkz.app.DTO.HospitalDTO;
import com.xworkz.app.DTO.MovieDTO;
import com.xworkz.app.repository.MovieRepository;
import com.xworkz.app.repository.MovieRepositoryImpl;
import com.xworkz.app.util.ValidUtil;
import com.xworkz.app.util.ValidationUtil;

public class MovieServiceImpl implements MovieService {
MovieRepository movieRepository=new MovieRepositoryImpl();
	

		
		@Override
		public boolean validateAndSave(MovieDTO movieDTO) {
			
			if(movieDTO!=null)
			{
				System.out.println("Valid data,can save..");
				System.out.println("Args passed :" +movieDTO);
				String name=movieDTO.getName();
				String HeroName=movieDTO.getHeroName();
				String category=movieDTO.getCategory();
				int noOfReels=movieDTO.getNoOfReels();
				
				if(ValidationUtil.validateString(name))
				{
					System.out.println("Name is Valid...");
				}
				else
				{
					System.err.println("Name is Invalid...");
					return false;
				}
				
				if(ValidationUtil.validateString(category))
				{
					System.out.println("category is Valid...");
				}
				else
				{
					System.err.println("category is Invalid...");
					return false;
				}
				
				if(ValidationUtil.validateInt(noOfReels))
				{
					System.out.println("noOfReels is Valid...");
				}
				else
				{
					System.err.println("noOfReels is Invalid...");
					return false;
				}
				
				if(ValidationUtil.validateString(HeroName))
				{
					System.out.println("Beds is Valid...");
				}
				else
				{
					System.err.println("Beds is Invalid...");
					return false;
				}
				System.out.println("All the data of the Hospital is Valid...");
				
				movieRepository.save(movieDTO);
				return true;
				
			}
			else
			{
				System.err.println("Invalid data,can't save..");
			}
			return false;
		}

		@Override
		public MovieDTO findByName(String name) {
			boolean isValid=ValidationUtil.validateString(name);
			
			if(isValid)
			{
				System.out.println("Name is Valid..");
				MovieDTO isFound= movieRepository.findByName(name);
				return isFound;
			}
			
		
				System.err.println("Name is Invalid");
			
			return null;
			
		}

		@Override
		public MovieDTO findByNameAndNoOfReels(String name, int noOfReels) {
			boolean isValid=ValidationUtil.validateString(name)&& ValidationUtil.validateInt(noOfReels);
			if(isValid)
			{
				System.out.println("Name and Doctors Valid");
				MovieDTO isFound=movieRepository.findByNameAndNoOfReels(name, noOfReels);
				return isFound;
			}
			System.err.println("Name and Doctors Invalid");
			return null;
		}

		
}
