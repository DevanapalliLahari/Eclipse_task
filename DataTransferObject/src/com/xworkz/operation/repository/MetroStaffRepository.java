package com.xworkz.operation.repository;

import com.xworkz.operation.DTO.MetroStaffDTO;

public interface MetroStaffRepository {
	int TOTAL_DATA = 5;
	public void save(MetroStaffDTO metroStaffDTO);
	public MetroStaffDTO findByName(String name);
	public MetroStaffDTO findByNoOfStaff(int noOfStaff);
	public MetroStaffDTO findByGender(String gender);
	public MetroStaffDTO[] readAll();

}
