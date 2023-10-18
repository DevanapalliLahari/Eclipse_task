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
public class PassportDTO implements Comparable<PassportDTO>{
	
	private int id;
	private String passportNo;
	private LocalDate issueDate;
	private String issuedBy;
	private LocalDate expiredDate;
	private PassportType type;
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result + ((passportNo == null) ? 0 : passportNo.hashCode());
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
		PassportDTO other = (PassportDTO) obj;
		if (id != other.id)
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		if (passportNo == null) {
			if (other.passportNo != null)
				return false;
		} else if (!passportNo.equals(other.passportNo))
			return false;
		return true;
	}

@Override
public int compareTo(PassportDTO args) {
	PassportDTO current=this;
	return current.passportNo.compareTo(args.passportNo);
}
 
}

