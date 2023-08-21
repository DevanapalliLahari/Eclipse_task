package com.xworkz.container.runner;

import com.xworkz.container.DTO.ThiefDTO;
import com.xworkz.container.implement.ThiefServiceImpl;
import com.xworkz.container.service.ThiefService;

public class ThiefRunner {

	public static void main(String[] args) {
		ThiefDTO dTO = new ThiefDTO("Scooter", 10, 45, "Alibaba", 12);
		System.out.println(dTO);

		ThiefService thief = new ThiefServiceImpl();
		thief.validateAndSave(dTO);
	}

}
