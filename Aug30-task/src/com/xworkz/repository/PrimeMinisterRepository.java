package com.xworkz.repository;

import com.xworkz.DTO.PrimeMinisterDTO;

public interface PrimeMinisterRepository {
int TOTAL_VALUES=3;
	public void save(PrimeMinisterDTO ministerDTO);
	public PrimeMinisterDTO findByName(String name);
}
