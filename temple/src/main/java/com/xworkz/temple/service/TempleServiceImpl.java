package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;


public class TempleServiceImpl implements TempleService{
private TempleRepository repository;
public TempleServiceImpl(TempleRepository repository)
{
	this.repository=repository;
}
	@Override
	public boolean validateAndSave(TempleDTO DTO) {
		System.out.println("Invoking the validateAndSave in TemleServiceImpl");
		repository.save(DTO);
		return true;
	}
	@Override
    public int total() {
		return this.repository.total();
    	
    }
    
	@Override
    public Collection<TempleDTO> getAll() {
    	
    	return this.repository.getAll();
    }

}

