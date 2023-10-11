package com.xworkz.grocery.repository;

import java.util.Collection;
import java.util.LinkedList;

import javax.sound.midi.ControllerEventListener;

import com.xworkz.grocery.dto.GroceryDto;

public class GroceryRepositoryImpl implements GroceryRepository{
	Collection<GroceryDto> group=new LinkedList<GroceryDto>();
	
	@Override
	public void save(GroceryDto DTO) {
		System.out.println("invoking the validateAndSave in groceryRepossitoryImpl"+DTO);
		boolean saved=this.group.add(DTO);
		if(saved)
		{
			System.out.println("The details of grocery  is saved:"+saved);
		}
		else
		{
			System.out.println("The details of grocery is not saved:"+saved);
		}
	}
		@Override
		public int total() {
			System.out.println(" Running the total in GroceryRepositoryImpl");
	         return this.group.size();
			}
		@Override
		public  Collection<GroceryDto> getAll()
		{
			System.out.println("Running getAll in GroceryRepositoryImpl");
			return this.group;
		}
}

	