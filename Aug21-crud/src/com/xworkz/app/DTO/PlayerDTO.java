package com.xworkz.app.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class PlayerDTO implements Serializable{
private String name;
private String sportName;
}
