package com.xworkz.app.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class HospitalDTO implements Serializable {

	private String name;
	private String location;
	private String doctorName;
	private int noOfDoctors;

}
