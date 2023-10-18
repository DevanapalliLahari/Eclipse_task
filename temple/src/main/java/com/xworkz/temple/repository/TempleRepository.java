package com.xworkz.temple.repository;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;



public interface TempleRepository {
public void save(TempleDTO DTO);
public default int total()
{
	System.out.println("Runnint total in TempleRepository");
	return 0;
}
public default  Collection<TempleDTO> getAll()
{
	System.out.println("Running getAll in TempleRepository");
	return null;
}
}

