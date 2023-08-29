package com.xworkz.app.service;

import com.xworkz.app.DTO.PlayerDTO;

public interface PlayerService {

	boolean validateAndSave(PlayerDTO playerDTO);

	PlayerDTO findByPlayerName(String name);

	PlayerDTO findByNameAndSportsName(String name, String sportsName);
}
