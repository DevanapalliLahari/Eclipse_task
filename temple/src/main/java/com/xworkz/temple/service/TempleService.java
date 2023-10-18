package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;



public interface TempleService {
public boolean validateAndSave(TempleDTO DTO);
public default int total()
{
	System.out.println("Running total in TempleService");
	return 0;
}
public default Collection<TempleDTO> getAll()
{
	return null;
	
}
}

