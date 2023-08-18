package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.MarketDTO;
import com.xworkz.operation.repository.MarketRepository;

public class MarketRepositoryImpl implements MarketRepository {
MarketDTO [] market=new MarketDTO[TOTAL_DATA];
int index=0;


@Override
	public void save(MarketDTO marketDTO) {
		System.out.println("Invoking the data of market:"+marketDTO);
		if(index<TOTAL_DATA)
		{
			this.market[index]=marketDTO;
			index++;
			System.out.println("Invoking the data");
		}
		else
		{
			System.out.println("we can't store the data,array is full");
		}
	}


@Override
public MarketDTO findByName(String name) {
	System.out.println(" Invoking the  data of customer: " + name);
	for (index = 0; index < market.length; index++) {
		if (market[index].getName() == name) {
			index++;
			System.out.println("Invoking the data");
			return market[index];
		}
	}
	System.out.println("The data con't be stored,  the array  is full");
	return null;
}


@Override
public MarketDTO findByLocation(String location) {
	System.out.println("finding the data of the customer location"+location);
	for (index = 0; index < market.length; index++) {
		if (market[index].getLocation() == location) {
			System.out.println("invoking the data");
			return market[index];
		}
		System.out.println(("---------------"));
	}
	System.out.println("we con't store,array is full");
	return null;
}


@Override
public MarketDTO findByType(String type) {
	System.out.println("finding the data of the customer location"+type);
	for (index = 0; index < market.length; index++) {
		if (market[index].getType() == type) {
			System.out.println("invoking the data");
			return market[index];
		}
		System.out.println(("---------------"));
	}
	System.out.println("we con't store,array is full");
	return null;
}


@Override
public MarketDTO[] readAll() {
	// TODO Auto-generated method stub
	return market;
}
}
