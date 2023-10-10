package com.xworkz.vegetable.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.jsoup.select.Evaluator.IsEmpty;

import com.xworkz.vegetable.dto.VegetableDTO;

public class VegetableTest {

	public static void main(String[] args) {
		VegetableDTO dto = new VegetableDTO("Tomato", 1, 20, 1.5);
		VegetableDTO dto1 = new VegetableDTO("Cabbage", 2, 60, 3);
		VegetableDTO dto2 = new VegetableDTO("Chilli", 3, 30, 2);
		VegetableDTO dto3 = new VegetableDTO("CaliFlower", 4, 20, 1);
		VegetableDTO dto4 = new VegetableDTO("BitterGuard", 5, 35, 3.5);
		VegetableDTO dto5 = new VegetableDTO("Potato", 6, 40, 2.5);
		VegetableDTO dto6 = new VegetableDTO("Raddish", 7, 30, 1);
		VegetableDTO dto7 = new VegetableDTO("Pea", 8, 20, 1.5);
		VegetableDTO dto8 = new VegetableDTO("Ginger", 9, 100, 1);
		VegetableDTO dto9 = new VegetableDTO("Onion", 10, 70, 1.5);

		Collection<VegetableDTO> collection = new HashSet<VegetableDTO>();
		
		Collection<VegetableDTO> collection2 = new HashSet<VegetableDTO>();

		
		

		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);


		collection2.addAll(collection);
		System.out.println(collection2 + "\n");

		System.out.println("remove - from collection2");
		collection2.remove(dto2);
		System.out.println(collection2 + "\n");

	
		collection.addAll(collection);
		System.out.println("VegitableDTO:" + collection.size());

		
		boolean data1 = collection.isEmpty();
		System.out.println("isEmpty :" + data1);
		Iterator<VegetableDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			VegetableDTO element = iterator.next();
			System.out.println("Vegetable names :" + element.getName());

		}
		boolean data2 = collection.remove("BitterGuard");
		System.out.println("remove :" + data2);
		boolean data3 = collection.removeAll(collection);
		System.out.println("removeAll :" +data3 );
		boolean data4 = collection.contains("Ginger");
		System.out.println("contains :" + data4);
		boolean data5 = collection.containsAll(collection);
		System.out.println("containsAll :" + data5);

		boolean data6 = collection.retainAll(collection);
		System.out.println("retainAll :" + data6);

		}

}
