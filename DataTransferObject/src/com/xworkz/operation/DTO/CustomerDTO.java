package com.xworkz.operation.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String name;
	private String emailId;
	private String location;
	private boolean married;
	private int  noOfCustomer;

	public CustomerDTO() {
		System.out.println("invoking no-argument cons of CustomerDTO");
	}

	public CustomerDTO(String name, String emailId, String location, boolean married, int noOfCustomer) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.location = location;
		this.married = married;
		this.noOfCustomer = noOfCustomer;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getLocation() {
		return location;
	}

	public boolean isMarried() {
		return married;
	}

	public int getNoOfCustomer() {
		return noOfCustomer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setNoOfCustomer(int noOfCustomer) {
		this.noOfCustomer = noOfCustomer;
	}

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", emailId=" + emailId + ", location=" + location + ", married=" + married
				+ ", noOfCustomer=" + noOfCustomer + "]";
	}

	

}
