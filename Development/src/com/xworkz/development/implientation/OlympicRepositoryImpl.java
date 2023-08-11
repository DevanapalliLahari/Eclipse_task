package com.xworkz.development.implientation;

import com.xworkz.development.app.OlympicRepository;

public class OlympicRepositoryImpl implements OlympicRepository {

	private int[] games = new int[TOTAL_YEARS];
	private int index = 0;

	@Override
	public void save(int year) {
		if (index < TOTAL_YEARS) {
			System.out.println("The element is at :"+ index +"is"+ year);
			this.games[index] = year;
			index=index+1;
			System.out.println("The next element is:"+index);
		}
		else
		{
			System.out.println("The is full,we can't store elements");
		}
	}
		public void display()
		{
			for (index = 0; index <games.length;index++)
			{
				System.out.println("The element stored at:"+ index +" is "+games[index]);
			}
		}
	
}