package com.xworkz.operation.repository;

import com.xworkz.operation.DTO.TheaterDTO;

public interface TheaterRepository {
int TOTAL_DATA=5;
public  void save(TheaterDTO theaterDTO);
public TheaterDTO findByName(String name);
public TheaterDTO findByFilmName(String filmName);
public TheaterDTO findByCapacity(int capacity);
public TheaterDTO[] readAll();
}
