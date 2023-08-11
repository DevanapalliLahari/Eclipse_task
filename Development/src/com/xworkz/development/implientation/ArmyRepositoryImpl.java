package com.xworkz.development.implientation;

import com.xworkz.development.app.ArmyRepository;

public class ArmyRepositoryImpl implements ArmyRepository {

	private String[] names = new String[TOTAL_ITEMS];

	private int index = 0;
	@Override
	public void save(String name) {
		if (index < TOTAL_ITEMS) {
			System.out.println("The element is at :"+ index +"is"+name);
			this.names[index]=name;
			index = index + 1;
			System.out.println("The next index is :" + index);
		} else {
			System.err.println("The array is full,we con't add names");
		}

	}
	public void display()
	{
		for (index = 0; index <names.length;index++)
		{
			System.out.println("The element stored at:"+ index +" is "+names[index]);
		}
	}

}
