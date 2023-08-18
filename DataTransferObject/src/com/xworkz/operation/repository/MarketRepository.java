package com.xworkz.operation.repository;

import com.xworkz.operation.DTO.MarketDTO;

public interface MarketRepository {
int TOTAL_DATA=5;

public void save(MarketDTO marketDTO);
public MarketDTO findByName(String name);
public MarketDTO findByLocation(String location);
public MarketDTO findByType(String type);
public MarketDTO[] readAll();
}
