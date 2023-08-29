package com.xworkz.app.repository;

import com.xworkz.app.DTO.PlayerDTO;

public class PlayerRepositoryImpl implements PlayerRepository {
	PlayerDTO[] dtos = new PlayerDTO[TOTAL_VALUES];
	int temp = 0;

	@Override
	public void save(PlayerDTO playerDTO) {
		if (temp < TOTAL_VALUES) {
			System.out.println("Invoking the data");
			this.dtos[temp] = playerDTO;
			temp++;
		} else {
			System.out.println("we can't stored,array full");
		}

	}
	@Override
	public PlayerDTO findByPlayerName(String name) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getName().equalsIgnoreCase(name))
			{
				System.out.println("Found Player name ");
				return dtos[index];
			}
			System.out.println("PlayerName is not matching moving to next index");
		}
		System.err.println("PlayerName is not Found");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSportsName(String name, String sportsName) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getName().equalsIgnoreCase(name)&&dtos[index].getSportName().equalsIgnoreCase(sportsName))
			{
				System.out.println("Found Player name and Sportsname");
				return dtos[index];
			}
			System.out.println("PlayerName and Sportsname is not matching moving to next index");
		}
		System.err.println("PlayerName and Sportsname is not Found");
		return null;
	}

}
