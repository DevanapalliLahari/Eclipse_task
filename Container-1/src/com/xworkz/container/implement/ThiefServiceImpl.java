package com.xworkz.container.implement;

import com.xworkz.container.DTO.ThiefDTO;
import com.xworkz.container.service.ThiefService;

public class ThiefServiceImpl implements ThiefService {

	@Override
	public void validateAndSave(ThiefDTO thiefDTO) {
		if (thiefDTO != null) {
			String specilization = thiefDTO.getSpecilization();
			int exp = thiefDTO.getExp();
			int age = thiefDTO.getAge();
			String gangName = thiefDTO.getGangName();
			int totalCases = thiefDTO.getTotalCases();

			if (specilization != null && !specilization.isEmpty() && specilization.length() > 3
					&& specilization.length() < 20) {
				System.out.println("The specilization of the thief is validate:" + specilization);

			} else {
				System.err.println("The specilization of the thief is not validate:" + specilization);
			}
			if (exp > 0 && exp < 30) {
				System.out.println("The exp of the thief is validate" + exp);
			} else {
				System.err.println("The exp of the thief is not validate" + exp);
			}

			if (age > 0 && age < 150) {
				System.out.println("The age of the thief is validate" + age);
			} else {
				System.err.println("The age of the thief is not validate" + age);
			}

			if (gangName != null && !gangName.isEmpty() && gangName.length() < 3 && gangName.length() < 20) {
				System.out.println("The gang name  is validate" + gangName);
			} else {
				System.out.println("The gang name of  is not validate:" + gangName);
			}

			if (totalCases > 0 && totalCases < 50) {
				System.out.println("The  totalCases of the thief is validate" + totalCases);
			} else {
				System.err.println("The  totalCases of the thief is not validate" + totalCases);
			}

		}
	}

}
