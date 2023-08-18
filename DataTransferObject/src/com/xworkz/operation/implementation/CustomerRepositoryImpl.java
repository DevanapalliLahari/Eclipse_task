package com.xworkz.operation.implementation;

import com.xworkz.operation.DTO.CustomerDTO;
import com.xworkz.operation.repository.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository {
	private CustomerDTO[] customers = new CustomerDTO[TOTAL_VALUES];
	private int index = 0;
	

	@Override
	public void save(CustomerDTO customerDTO) {
		System.out.println(" Invoking the  data of customer: " + customerDTO);
		if (this.index < TOTAL_VALUES) {
			this.customers[index] = customerDTO;
			index++;
			System.out.println("Invoking the data");
		} else {
			System.out.println("The data con't be stored,  the array  is full");
		}
	}

	@Override
	public CustomerDTO findByName(String name) {
		System.out.println(" Invoking the  data of customer: " + name);
		for (index = 0; index < customers.length; index++) {
			if (customers[index].getName() == name) {
				index++;
				System.out.println("Invoking the data");
				return customers[index];
			}
		}
		System.out.println("The data con't be stored,  the array  is full");
		return null;
	}

	@Override
	public CustomerDTO findByLocation(String location) {
		System.out.println("finding the data of the customer location"+location);
		for (index = 0; index < customers.length; index++) {
			if (customers[index].getLocation() == location) {
				System.out.println("invoking the data");
				return customers[index];
			}
			System.out.println(("---------------"));
		}
		System.out.println("we con't store,array is full");
		return null;
	}

	@Override
	public CustomerDTO findByNoOFCustomer(int noOfCustomer) {
		System.out.println("finding the no of customers"+noOfCustomer);
		for(int index=0;index<customers.length;index++)
		{
			if(customers[index].getNoOfCustomer()==noOfCustomer)
			{
				index++;
				System.out.println("the data is");
				return customers[index];
			}
		}
		System.out.println("the data con't store,array  is full");
		return null;
	}

	@Override
	public CustomerDTO[] readAll() {
		// TODO Auto-generated method stub
		return customers;
	}
	
}
