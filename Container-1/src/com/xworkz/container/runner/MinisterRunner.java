package com.xworkz.container.runner;

import java.security.Provider.Service;

import com.xworkz.container.DTO.MinisterDTO;
import com.xworkz.container.implement.MinisterServiceImpl;
import com.xworkz.container.service.MinisterService;

public class MinisterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MinisterDTO minister=new MinisterDTO("Ambati Rambabu",10,"Irrigation","Y.S.R Party");
    System.out.println(minister);
	MinisterService ministerService=new MinisterServiceImpl();
	ministerService.validateAndSave(minister);
	}

    

}
