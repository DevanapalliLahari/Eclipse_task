package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDto;

public interface GroceryService {
public boolean validateAndSave(GroceryDto DTO);
public default int total()
{
	System.out.println("running total in GroceryService");
	return 0;
	
}
public default Collection<GroceryDto> getAll()
{
	System.out.println("Running  getAll in GroceryRepository");
	return null;
}
}
