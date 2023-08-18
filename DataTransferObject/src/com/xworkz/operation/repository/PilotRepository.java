package com.xworkz.operation.repository;

import com.xworkz.operation.DTO.PilotDTO;

public interface PilotRepository {
int TOTAL_DATA=5;
void save(PilotDTO pilotDTO);
public PilotDTO findByName(String name);
public PilotDTO findByLocation(String location);
public PilotDTO findByAge(int age);
public PilotDTO[] readAll();

}
