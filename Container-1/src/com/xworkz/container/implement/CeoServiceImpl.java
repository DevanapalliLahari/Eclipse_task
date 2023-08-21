package com.xworkz.container.implement;

import com.xworkz.container.DTO.CeoDTO;

import com.xworkz.container.service.CeoService;

public class CeoServiceImpl implements CeoService {

	@Override
	public void validateAndSave(CeoDTO ceoDTO) {
		if (ceoDTO != null) {
			System.out.println("Validate Data save");
			System.out.println("valid data:" + ceoDTO);
			String name = ceoDTO.getName();
			String companyName = ceoDTO.getCompanyName();
			int exp = ceoDTO.getExp();
			double salary = ceoDTO.getSalary();

			if (name != null && !name.isEmpty() && name.length() < 3 && name.length() < 20) {
				System.out.println("The name of CEO is validate" + name);
			} else {
				System.out.println("The name of CEO is not validate:" + name);
			}

			if (companyName != null && !companyName.isEmpty() && companyName.length() < 3
					&& companyName.length() < 20) {
				System.out.println("The company name is  valid:" + companyName);
			} else {
				System.out.println("The company name is not valid:" + companyName);
			}
			if (exp > 0 && exp < 30) {
				System.out.println("The exp of CEO is valid:" + exp);
			} else {
				System.out.println("The exp of CEO is not valid:" + exp);
			}

			if (salary > 0 && salary < 10000000) {
				System.out.println("The salary of CEO is valid:" + salary);
			} else {
				System.out.println("The salary of CEO is valid:" + salary);
			}
		}
	}

}
