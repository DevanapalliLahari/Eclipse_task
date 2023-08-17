package com.xworkz.operation.DTO;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable{
private String staffName;
private int noOfStaff;
private String mailId;
private String gender;
private int salary;

public MetroStaffDTO()
{
	System.out.println("invoking metro staff data ");
}

public MetroStaffDTO(String staffName, int noOfStaff, String mailId, String gender, int salary) {
	super();
	this.staffName = staffName;
	this.noOfStaff = noOfStaff;
	this.mailId = mailId;
	this.gender = gender;
	this.salary = salary;
}

public String getStaffName() {
	return staffName;
}

public int getNoOfStaff() {
	return noOfStaff;
}

public String getMailId() {
	return mailId;
}

public String getGender() {
	return gender;
}

public int getSalary() {
	return salary;
}

public void setStaffName(String staffName) {
	this.staffName = staffName;
}

public void setNoOfStaff(int noOfStaff) {
	this.noOfStaff = noOfStaff;
}

public void setMailId(String mailId) {
	this.mailId = mailId;
}

public void setGender(String gender) {
	this.gender = gender;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "MetroStaffDTO [staffName=" + staffName + ", noOfStaff=" + noOfStaff + ", mailId=" + mailId + ", gender="
			+ gender + ", salary=" + salary + "]";
}

}
