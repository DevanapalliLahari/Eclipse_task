package com.xworkz.dto;

import java.io.Serializable;

import com.xworkz.option.MovieLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDTO implements Serializable{
private String name;
private int id;
private MovieLanguage lang;
private String producer;
private String director;
private double budgetInCrores;
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MovieDTO other = (MovieDTO) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public int hashCode() {
	
	return 300;
}

}
