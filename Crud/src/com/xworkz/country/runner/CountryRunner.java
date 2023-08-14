package com.xworkz.country.runner;

import com.xworkz.country.app.CountryRepository;
import com.xworkz.country.implementation.CountryRepositoryImpl;

public class CountryRunner {


	public static void main(String[] args) {
		System.out.println("Running main");
		CountryRepository repository = new CountryRepositoryImpl();
		repository.save("India");
		repository.save("Pakisthan");
		repository.save("Australia");
		repository.save("England");
		repository.save("Japan");
		repository.save("South AFrica");
		repository.save("Srilanka");
		repository.save("Bangaladesh");
		repository.save("Chaina");
		repository.save("Russia");
		repository.display();
        System.out.println("=================");
		System.out.println(repository.isExit("England"));
		System.out.println("===============");
		System.out.println(repository.findReturnUpperCase("India"));
		System.out.println("==================");

		String[] string = repository.findStartsWith("J");
		for (int pos = 0; pos < string.length; pos++) {
			if (string[pos] != null) {
				System.out.println("the names starts with:" + string[pos]);
			}
		}
		String[] pos1 = repository.findEndsWith("a");
			for (int index = 0; index < pos1.length; index++) {

				if (pos1[index] != null) {

					System.out.println("the name ends with:" + pos1[index]);
					System.out.println("===================");
				}
			}
		

		String[] start1=repository.findMatching("Pakisthan");
		
			for (int index = 0; index < start1.length; index++) {

				if (start1[index] != null) {

					System.out.println("the name matches with:" + start1[index]);
					System.out.println("=============");
				}
			}
			
			
		    repository.orderDesc();
		    System.out.println("=================");
		    repository.orderAsc();
		    System.out.println("==============");
		    repository.saveCount();
	}

}
