package com.xworkz.temple.repository;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.temple.dto.TempleDTO;


public class TempleRepositoryImpl implements TempleRepository {
	Collection<TempleDTO> group=new HashSet<TempleDTO>();
	@Override
	public void save(TempleDTO DTO) {
    System.out.println("invoking save  in TempleRepository");	
    boolean saved=this.group.add(DTO);
    if(saved)
    {
    	System.out.println("The data is saved"+saved);
    }
    else
    {
    	System.out.println("The data is not saved"+saved);
    }
	}
	
	@Override
	public int total() {
		System.out.println("Running total in TempleRepositoryImpl");
		return this.group.size();
		
	}
	@Override 
	public Collection<TempleDTO> getAll() {
		System.out.println("Running total in TempleRepositoryImpl");
		return this.group;
			}

}
