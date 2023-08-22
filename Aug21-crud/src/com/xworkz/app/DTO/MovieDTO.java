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

public class MovieDTO implements Serializable {
	private String name;
	private String heroName;
	private String category;
	private int noOfReels;
}
