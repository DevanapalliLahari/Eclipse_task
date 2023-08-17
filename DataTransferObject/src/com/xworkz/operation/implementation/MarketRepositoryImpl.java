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
}
