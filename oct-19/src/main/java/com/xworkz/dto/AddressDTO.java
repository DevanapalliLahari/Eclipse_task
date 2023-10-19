package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class AddressDTO implements Comparable<AddressDTO>{

	private Integer id;
	private Integer no;
	private String street;
	private String city;
	private String State;
	private int pincode;
	@Override
	public int compareTo(AddressDTO args) {
		AddressDTO current=this;
		
		return args.getCity().compareTo(current.getCity());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressDTO other = (AddressDTO) obj;
		if (id != other.id)
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	
}
