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
public class PersonDTO implements Comparable<PersonDTO>{
private int id;
private String name;
private String email;
private Long mobile;
@Override
public int compareTo(PersonDTO args) {
	PersonDTO current=this;
	return current.getName().compareTo(args.getName());
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
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
	PersonDTO other = (PersonDTO) obj;
	if (id != other.id)
		return false;
	if (mobile == null) {
		if (other.mobile != null)
			return false;
	} else if (!mobile.equals(other.mobile))
		return false;
	return true;
}
}
