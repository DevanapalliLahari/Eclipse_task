package com.xworkz.app.repository;

import com.xworkz.app.DTO.PlayerDTO;

public interface PlayerRepository {
	int TOTAL_VALUES = 3;

	public void save(PlayerDTO playerDTO);

	PlayerDTO findByPlayerName(String name);

	PlayerDTO findByNameAndSportsName(String name, String sportsName);
}
