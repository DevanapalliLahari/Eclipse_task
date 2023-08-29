package com.xworkz.app.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper=true)

public class VehicleDTO extends AbstractDTO implements Serializable{
	private String name="car";
	private String type="rented";
	private int noOfWheels=20;

}
