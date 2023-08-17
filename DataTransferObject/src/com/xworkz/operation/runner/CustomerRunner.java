package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.CustomerDTO;
import com.xworkz.operation.implementation.CustomerRepositoryImpl;
import com.xworkz.operation.repository.CustomerRepository;

public class CustomerRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		CustomerDTO customerDTO = new CustomerDTO("Arun", "arun@gmmail.com", "Vijayanagaram", false,939);
		System.out.println(customerDTO.toString());
		System.out.println();
		
		CustomerDTO customerDTO1 = new CustomerDTO("Aruna", "aruna@gmmail.com", "Kerala", true,978);
		System.out.println(customerDTO1.toString());
		System.out.println();
		
		CustomerDTO customerDTO2 = new CustomerDTO("Sam", "sam@gmmail.com", "Bangloore", false,974);
		System.out.println(customerDTO2.toString());
		System.out.println();
		
		CustomerDTO customerDTO3 = new CustomerDTO("Meera", "meera@gmmail.com", "Chennai", false,939);
		System.out.println(customerDTO3.toString());
		System.out.println();
		
		CustomerDTO customerDTO4 = new CustomerDTO("Seeta", "Seeta@gmmail.com", "Hyderabad", true,674);
		System.out.println(customerDTO4.toString());
		System.out.println();
		
		
		CustomerRepository repository=new CustomerRepositoryImpl();
		repository.save(customerDTO);
		System.out.println();
		
		CustomerRepository repository1=new CustomerRepositoryImpl();
		repository1.save(customerDTO1);
		System.out.println();
		
		CustomerRepository repository2=new CustomerRepositoryImpl();
		repository2.save(customerDTO2);
		System.out.println();
		
		CustomerRepository repository3=new CustomerRepositoryImpl();
		repository3.save(customerDTO3);
		System.out.println();
		
		CustomerRepository repository4=new CustomerRepositoryImpl();
		repository4.save(customerDTO4);
		System.out.println();
		
	}

}
