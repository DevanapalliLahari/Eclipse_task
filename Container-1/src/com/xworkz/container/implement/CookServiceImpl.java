package com.xworkz.container.implement;

import com.xworkz.container.DTO.CookDTO;
import com.xworkz.container.service.CookService;

public class CookServiceImpl implements CookService{

	

	@Override
	public void validateAndSave(CookDTO cookDTO) {
if(cookDTO!=null) {
	System.out.println("The data is validate");
	System.out.println("The valide data is:"+cookDTO);
	String specialItem=cookDTO.getSpecialItem();
	String hotelName=cookDTO.getHotelName();
	String gender=cookDTO.getGender();
	double salary=cookDTO.getSalary();
	
	
	if ( specialItem!= null && !specialItem.isEmpty() && specialItem.length() < 3 && specialItem.length() < 20) {
		System.out.println("The cook specialItem  is validate" + specialItem);
	} else {
		System.out.println("The cook specialItem is not validate:" + specialItem);
	}
	
	if (hotelName != null && !hotelName.isEmpty() && hotelName.length() < 3 && hotelName.length() < 20) {
		System.out.println("The hotel name  is validate" + hotelName);
	} else {
		System.out.println("The hotel name of  is not validate:" + hotelName);
	}
	
	if (gender != null && !gender.isEmpty() && gender.length() < 3 && gender.length() < 20) {
		System.out.println("The cook gender  validate" + gender);
	} else {
		System.out.println("The cook gender is not validate:" + gender);
	}
	if (salary > 0 && salary < 10000000) {
		System.out.println("The salary of Cook is valid:" + salary);
	} else {
		System.out.println("The salary of Cook is valid:" + salary);
	}
}
	}

	
	
	
}
