package com.xworkz.war.dto;

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
public class CountryDTO implements Comparable<CountryDTO>{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((countriesParticipated == null) ? 0 : countriesParticipated.hashCode());
		result = prime * result + ((PresidentDTO == null) ? 0 : PresidentDTO.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (countriesParticipated == null) {
			if (other.countriesParticipated != null)
				return false;
		} else if (!countriesParticipated.equals(other.countriesParticipated))
			return false;
		if (PresidentDTO == null) {
			if (other.PresidentDTO != null)
				return false;
		} else if (!PresidentDTO.equals(other.PresidentDTO))
			return false;
		return true;
	}
	private String countriesParticipated;
	private Integer id;
	private String continent;
	private PresidentDTO PresidentDTO;
	@Override
	public int compareTo(CountryDTO args) {
		CountryDTO current=this;
		return args.getCountriesParticipated().compareTo(current.getCountriesParticipated());
	}

}
