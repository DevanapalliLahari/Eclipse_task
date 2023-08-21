package com.xworkz.container.implement;

import com.xworkz.container.DTO.MechanicDTO;

import com.xworkz.container.service.MechanicService;

public class MechanicServiceImpl implements MechanicService {

	@Override
	public void validateAndSave(MechanicDTO mechanicDTO) {
		// TODO Auto-generated method stub
		if (mechanicDTO != null) {
			System.out.println("The data is validate");
			System.out.println("The validate data is:" + mechanicDTO);
			String garageName = mechanicDTO.getGarageName();
			String gstNo = mechanicDTO.getGstNo();
			String specilization = mechanicDTO.getSpecilization();
			int bikeServiceCost = mechanicDTO.getBikeServiceCost();

			if (garageName != null && !garageName.isEmpty() && garageName.length() > 3 && garageName.length() < 20) {
				System.out.println("The name of garage is validate" + garageName);
			} else {
				System.out.println("The name of  is garage not validate:" + garageName);
			}

			if (gstNo != null && !gstNo.isEmpty() && gstNo.length() > 3 && gstNo.length() < 30) {
				System.out.println("The gst of the mechanic is validate:" + gstNo);
			} else {
				System.out.println("The gst of the mechanic is not validate:" + gstNo);
			}

			if (specilization != null && !specilization.isEmpty() && specilization.length() < 3
					&& specilization.length() < 20) {
				System.out.println("The specilization of machanic is validate" + specilization);
			} else {
				System.out.println("The specilization of  is mechanic not validate:" + specilization);
			}

			if (bikeServiceCost > 0 && bikeServiceCost < 10000000) {
				System.out.println("The bikeServiceCost  is validate:" + bikeServiceCost);
			} else {
				System.out.println("The bikeServiceCost  is not validate:" +bikeServiceCost);
			}

		}

	}

}
