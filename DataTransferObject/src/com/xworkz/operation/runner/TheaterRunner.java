package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.TheaterDTO;
import com.xworkz.operation.implementation.TheaterRepositoryImpl;
import com.xworkz.operation.repository.TheaterRepository;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		TheaterDTO theaterDTO = new TheaterDTO("Imax", "Salar", 250, 300, 500);

		TheaterDTO theaterDTO1 = new TheaterDTO("CTC", "Jailar", 200, 350, 250);

		TheaterDTO theaterDTO2 = new TheaterDTO("PVR", "Baby", 300, 300, 400);

		TheaterDTO theaterDTO3 = new TheaterDTO("Tri Veni", "Spy", 280, 300, 300);

		TheaterDTO theaterDTO4 = new TheaterDTO("Rk", "Bro", 300, 400, 300);

		TheaterRepository repository = new TheaterRepositoryImpl();

		repository.save(theaterDTO);
		repository.save(theaterDTO1);
		repository.save(theaterDTO2);
		repository.save(theaterDTO3);
		repository.save(theaterDTO4);

		TheaterDTO dTO = repository.findByName("Imax");
		System.out.println(dTO);

		TheaterDTO dTO1 = repository.findByFilmName("Spy");
		System.out.println(dTO1);

		TheaterDTO dTO2 = repository.findByCapacity(200);
		System.out.println(dTO2);
		System.out.println();

		TheaterDTO[] dTO3 = repository.readAll();
		for (int index = 0; index < dTO3.length; index++) {
			if (dTO3[index] != null) {
				System.out.println(dTO3[index]);
			}
		}
	}
}
