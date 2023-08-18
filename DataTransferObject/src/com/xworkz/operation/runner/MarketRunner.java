package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.CustomerDTO;
import com.xworkz.operation.DTO.MarketDTO;
import com.xworkz.operation.implementation.MarketRepositoryImpl;
import com.xworkz.operation.repository.MarketRepository;

public class MarketRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		MarketDTO market = new MarketDTO("RK MARKET", "Anatapur", "Super Market", 250, 300);

		MarketDTO market1 = new MarketDTO("The Urban Farmers Market", "Araku", "vegtable market", 120, 150);

		MarketDTO market2 = new MarketDTO("pure Form", "Ooty", "Form market", 150, 200);

		MarketDTO market3 = new MarketDTO("The Glories Mart", "Bangloore", "Super Mart", 300, 400);

		MarketDTO market4 = new MarketDTO("Sweet Farms", "Chennai", " Market", 160, 200);
		MarketRepository repository = new MarketRepositoryImpl();
		repository.save(market);

		repository.save(market1);

		repository.save(market2);

		repository.save(market3);

		repository.save(market4);

		MarketDTO dTO = repository.findByName("pure Form");
		System.out.println(dTO);

		MarketDTO dTO1 = repository.findByLocation("Bangloore");
		System.out.println(dTO1);

		MarketDTO dTO2 = repository.findByType("Market");
		System.out.println(dTO2);

		MarketDTO[] dTO3 = repository.readAll();
		{
			for (int index = 0; index < dTO3.length; index++) {
				if (dTO3[index] != null) {
					System.out.println(dTO3[index]);
				}
			}
		}

	}

}
