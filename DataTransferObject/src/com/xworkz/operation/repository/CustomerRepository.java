package com.xworkz.operation.repository;

import com.xworkz.operation.DTO.CustomerDTO;

public interface CustomerRepository {
int TOTAL_VALUES=5;
public  void save(CustomerDTO customerDTO);
public CustomerDTO findByName(String name);
public CustomerDTO findByLocation(String location);
public CustomerDTO findByNoOFCustomer(int noOfCustomer);
public CustomerDTO[] readAll();
}
