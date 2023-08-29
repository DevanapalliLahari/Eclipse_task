package com.xworkz.app.runner;

import com.xworkz.app.DTO.PlayerDTO;
import com.xworkz.app.repository.PlayerRepository;
import com.xworkz.app.repository.PlayerRepositoryImpl;
import com.xworkz.app.service.PlayerService;
import com.xworkz.app.service.PlayerServiceImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO players = new PlayerDTO("virat", "Cricket");

		PlayerRepository repository = new PlayerRepositoryImpl();

		PlayerService service = new PlayerServiceImpl(repository);
		boolean play = service.validateAndSave(players);
		if (play) {
			System.out.println("Saved :" + play);
		} else {
			System.out.println("Do not saved :" + play);
		}
		PlayerDTO foundName=service.findByPlayerName("virat");
		System.out.println(foundName);
		
		PlayerDTO foundData=service.findByNameAndSportsName("virat", "Cricket");
		System.out.println(foundData);
	}

}
