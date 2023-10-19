package com.xworkz.dto;

import java.time.LocalDate;

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
public class BrandDTO implements Comparable<BrandDTO>{
	private Integer id;
	private String name;
	private String gstno;
	private AddressDTO address;
	private LocalDate estFrom;
		@Override
		public int compareTo(BrandDTO args) {
			BrandDTO current=this;
			return args.getName().compareTo(current.getName());
		}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gstno == null) ? 0 : gstno.hashCode());
		result = prime * result + id;
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
		BrandDTO other = (BrandDTO) obj;
		if (gstno == null) {
			if (other.gstno != null)
				return false;
		} else if (!gstno.equals(other.gstno))
			return false;
		if (id != other.id)
			return false;
		return true;
	}


}
