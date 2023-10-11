package com.xworkz.grocery.dto;

import java.io.Serializable;

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
public class GroceryDto implements Serializable{
private String name;
private String type;
private double priicee;
private double quantity;
}
