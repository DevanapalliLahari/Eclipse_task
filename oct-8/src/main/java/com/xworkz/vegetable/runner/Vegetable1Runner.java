package com.xworkz.vegetable.runner;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.vegetable.dto.VegetableDTO;

public class Vegetable1Runner {

	public static void main(String[] args) {
		VegetableDTO dto = new VegetableDTO("Tomato", 1, 20, 1.5);
		VegetableDTO dto1 = new VegetableDTO("Cabbage", 2, 60, 3);
		VegetableDTO dto2 = new VegetableDTO("Chilli", 3, 30, 2);
		VegetableDTO dto3 = new VegetableDTO("CaliFlower", 4, 20, 1);
		VegetableDTO dto4 = new VegetableDTO("BitterGuard", 5, 35, 3.5);
		
		
		Collection<VegetableDTO> collection = new HashSet<VegetableDTO>();
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		Collection<VegetableDTO> collection1 = new HashSet<VegetableDTO>();
		
		collection.forEach((v)->{
			if(v.getPrice()>=30)
			{
				System.out.println("The price is high for:"+v.getName());
			}
			else
			{
				System.out.println("The price is ok for:"+v.getName());
				collection1.add(v);
			}
			
		});
		
		collection1.forEach((d)->System.out.println(d));
}
}
