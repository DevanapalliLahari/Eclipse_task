package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.CustomerDTO;
import com.xworkz.operation.implementation.CustomerRepositoryImpl;
import com.xworkz.operation.repository.CustomerRepository;

public class CustomerRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		CustomerDTO customerDTO = new CustomerDTO("Arun", "arun@gmmail.com", "Vijayanagaram", false,939);
		
		
		CustomerDTO customerDTO1 = new CustomerDTO("Aruna", "aruna@gmmail.com", "Kerala", true,978);
		
		CustomerDTO customerDTO2 = new CustomerDTO("Sam", "sam@gmmail.com", "Bangloore", false,974);
		
		
		CustomerDTO customerDTO3 = new CustomerDTO("Meera", "meera@gmmail.com", "Chennai", false,939);
		
		
		CustomerDTO customerDTO4 = new CustomerDTO("Seeta", "Seeta@gmmail.com", "Hyderabad", true,674);
		
		
		CustomerRepository repository=new CustomerRepositoryImpl();
		repository.save(customerDTO);
		
		repository.save(customerDTO1);
		
		repository.save(customerDTO2);
		
		repository.save(customerDTO3);
		
		repository.save(customerDTO4);
		
		CustomerDTO dTO=repository.findByName("Sam");
		System.out.println(dTO);
		
		CustomerDTO dTO1=repository.findByLocation("Bangloore");
		System.out.println(dTO1);
		
		CustomerDTO dTO2=repository.findByNoOFCustomer(978);
		System.out.println(dTO2);
		
		
		CustomerDTO[] dTO3=repository.readAll();
		{
			for(int index=0;index<dTO3.length;index++)
			{
				if(dTO3[index]!=null)
				{
					System.out.println(dTO3[index]);
				}
			}
		}
	}

}
