package com.xworkz.app.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class WasteDTO implements Serializable{

private String name;
private String type;
private double weight;
}
