package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.CustomerDTO;
import com.xworkz.operation.repository.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository {
 private CustomerDTO [] customers=new CustomerDTO[TOTAL_VALUES];
 private int index=0;
 
 
 @Override
	public void save(CustomerDTO customerDTO) {
	 System.out.println(" Invoking the  data of customer: "+customerDTO);
	if(this.index<TOTAL_VALUES)	
	{
		this.customers[index]=customerDTO;
		index++;
		System.out.println("Invoking the data");
	}
	else
	{
		System.out.println("The data con't be stored,  the array  is full");
	}
 }
}
			 
			 
