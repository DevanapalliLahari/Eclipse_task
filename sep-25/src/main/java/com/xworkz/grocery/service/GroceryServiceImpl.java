package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDto;
import com.xworkz.grocery.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {

	private GroceryRepository repository;
	public GroceryServiceImpl(GroceryRepository repository)
	{
		this.repository=repository;

		System.out.println("Invoking the data");
	}
	@Override
	public boolean validateAndSave(GroceryDto DTO) {
		System.out.println("invoking validateAndSave in GroceryServiceImpl");
		repository.save(DTO);
		return true;
	}
    @Override
    public int total() {
		return this.repository.total();
    	
    }
    @Override
    public Collection<GroceryDto> getAll() {
    	
    	return this.repository.getAll();
    }
}
