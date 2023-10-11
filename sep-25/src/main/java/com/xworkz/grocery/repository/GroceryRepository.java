package com.xworkz.grocery.repository;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDto;

public interface GroceryRepository {
public void save(GroceryDto DTO);
public default int total()
{
	System.out.println("running total in groceryRepository");
	return 0;
}
public default Collection<GroceryDto> getAll()
{
	System.out.println("Running  getAll in GroceryRepository");
	return null;
	
}
}
