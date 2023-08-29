package com.xworkz.app.service;

import com.xworkz.app.DTO.PlayerDTO;
import com.xworkz.app.repository.PlayerRepository;
import com.xworkz.app.util.ValidationUtil;

public class PlayerServiceImpl implements PlayerService {
	private PlayerRepository playerRepository;

	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	@Override
	public boolean validateAndSave(PlayerDTO playerDTO) {
		if (playerDTO != null) {
			System.out.println("the data is validate");
			System.out.println("Valid data:" + playerDTO);
			String name = playerDTO.getName();
			String sportName = playerDTO.getSportName();
			if (ValidationUtil.validateString(name)) {
				System.out.println("The name of the player is validate:" + name);
			} else {
				System.out.println("The name of the player is not validate:" + name);
				return false;
			}

			if (ValidationUtil.validateString(sportName)) {
				System.out.println("The Sport name is valid:" + sportName);
			} else {
				System.out.println("The sport name is not valid:" + sportName);
				return false;
			}
			playerRepository.save(playerDTO);
			return true;
		} else {
			System.out.println("Invalid data");
		}
		return false;
	}
	@Override
	public PlayerDTO findByPlayerName(String name) {
		boolean isValid=ValidationUtil.validateString(name);
		if(isValid)
		{
			System.out.println("Player name is Valid");
			PlayerDTO isFound=playerRepository.findByPlayerName(name);
			return isFound;
		}
		System.out.println("Player name is Invalid");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSportsName(String name, String sportsName) {
		
		boolean isValid=ValidationUtil.validateString(name)&&ValidationUtil.validateString(sportsName);
		if(isValid)
		{
			System.out.println("Player name and Sportsname is Valid");
			PlayerDTO isFound=playerRepository.findByNameAndSportsName(name, sportsName);
			return isFound;
		}
		System.out.println("Player name and Sports name is Invalid");
		
		return null;
	}
}
