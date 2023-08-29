package com.xworkz.app.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class AbstractDTO implements Serializable{
	private String whoCreated;
	private String whoUpdated;
	private LocalDate whenCreated;
	private LocalDate WhenUpdated;
	
}
