package com.xwworkz.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.dto.AddressDTO;
import com.xworkz.dto.BrandDTO;
import com.xworkz.dto.ProductDTO;
import com.xworkz.dto.ProductType;

public class ProductTester {
public static void main(String[] args) {
	
	AddressDTO address1=new AddressDTO(1, 111,"Gandi","puttaparthi","A.P",515231);
	AddressDTO address2=new AddressDTO(2, 112,"Dhurga","Anantapur","Gujarat",515242);
	AddressDTO address3=new AddressDTO(3, 113,"Nehru","Bangloore","Bihar",515872);
	AddressDTO address4=new AddressDTO(4, 114,"Lal Bhug","Hyderabad","Maharastra",515451);
	AddressDTO address5=new AddressDTO(5, 115,"XYZ","Mumbai","Oddisa",678302);
	AddressDTO address6=new AddressDTO(6, 116,"S.C","Pune","U.p",674321);
	AddressDTO address7=new AddressDTO(7, 117,"B.c","Chennai","Kerala",453231);
	AddressDTO address8=new AddressDTO(8, 118,"Sarkar","Keralaa","T.M",876543);
	AddressDTO address9=new AddressDTO(9, 119,"Main","Vizag","M.P",987342);
	AddressDTO address10=new AddressDTO(10, 120,"Mainblock","Sikindarabad","Telangana",497542);

	
	List<BrandDTO> name1=new LinkedList<BrandDTO>();
	BrandDTO brand1=new BrandDTO(1, "nike","AS23453A", address1,LocalDate.of(2012, 02, 8));
	BrandDTO brand2=new BrandDTO(2, "puma","AS23GJ73A", address2,LocalDate.of(2011, 04, 4));
	BrandDTO brand3=new BrandDTO(3, "Adidas","ASER1453A", address3,LocalDate.of(2014, 02, 8));
	BrandDTO brand4=new BrandDTO(4, "Ikea","AS2564353A", address4,LocalDate.of(2015, 07, 10));
	BrandDTO brand5=new BrandDTO(5, "Bajaj","AS2327673A", address5,LocalDate.of(2014, 07, 8));
	BrandDTO brand6=new BrandDTO(6, "Prestige","ASt31453A", address6,LocalDate.of(2018, 06, 11));
	BrandDTO brand7=new BrandDTO(7, "Boat","AS2355753A", address7,LocalDate.of(2012, 04, 9));
	BrandDTO brand8=new BrandDTO(8, "Dell","AS28453A", address8,LocalDate.of(2002, 04, 8));
	BrandDTO brand9=new BrandDTO(9, "Usha","AS23A7854", address9,LocalDate.of(2014, 06, 15));
	BrandDTO brand10=new BrandDTO(10, "Comfy","AS236543A", address10,LocalDate.of(2017, 01, 13));
	name1.add(brand1);
	name1.add(brand2);
	name1.add(brand3);
	name1.add(brand4);
	name1.add(brand5);
	name1.add(brand6);
	name1.add(brand7);
	name1.add(brand8);
	name1.add(brand9);
	name1.add(brand10);

	Collection<ProductDTO> type=new HashSet<ProductDTO>();

	ProductDTO product1=new ProductDTO(1, "Shoe",ProductType.BEAUTY,brand1,1000.09,1.0);
	ProductDTO product2=new ProductDTO(2, "Shoe",ProductType.BEAUTY,brand2,1050.09,1.0);
	ProductDTO product3=new ProductDTO(3, "dress",ProductType.BEAUTY,brand3,1452.09,2.0);
	ProductDTO product4=new ProductDTO(4, "kit",ProductType.BEAUTY,brand4,112.09,3.0);
	ProductDTO product5=new ProductDTO(5, "bike",ProductType.TRAVEL,brand5,1762.09,2.0);
	ProductDTO product6=new ProductDTO(6, "Cooker",ProductType.KITCHEN_APP,brand6,1456.09,1.0);
	ProductDTO product7=new ProductDTO(7, "headset",ProductType.ELETRONIC,brand7,4352.09,2.0);
	ProductDTO product8=new ProductDTO(8, "laptop",ProductType.ELETRONIC,brand8,50000.09,2.0);
	ProductDTO product9=new ProductDTO(9, "fan",ProductType.ELETRONIC,brand9,1452.1000,2.0);
	ProductDTO product10=new ProductDTO(10, "bed",ProductType.FURNITURE,brand10,5000.09,2.0);

	type.add(product1);
	type.add(product2);
	type.add(product3);
	type.add(product4);
	type.add(product5);
	type.add(product6);
	type.add(product7);
	type.add(product8);
	type.add(product9);
	type.add(product10);

	System.out.println("========Get productDTO by  pincode========");
	
	List<Integer> pin=type.stream()
	.map(e-> e.getBrandDTO().getAddress().getPincode()).collect(Collectors.toList());
	pin.stream().sorted().forEach(e-> System.out.println(e));

	System.out.println("========Get All AddressDTO by product name And Sort By Id========");
    Optional<ProductDTO> name=type.stream().filter(e-> e.getName().equals("Shoe"))
    .collect(Collectors.toList()).stream().max((a,b)->b.compareTo(a));
    if(name.isPresent())
    {
    	System.out.println(name);
    }

	System.out.println("========Get BrandDTO by  ProductDTO========");
   List<AddressDTO> pro=type.stream()
		   .map(e-> e.getBrandDTO().getAddress()).collect(Collectors.toList());
   pro.forEach(e-> System.out.println(e));
	System.out.println("========Get AddressDTO by  BrandDTO========");
    List<AddressDTO> brand11=type.stream().map(e-> e.getBrandDTO().getAddress())
    		.collect(Collectors.toList());
    brand11.forEach(e-> System.out.println(e));
    
	System.out.println("========Get All ProductDTO by Max Price========");
	
	 Optional<ProductDTO> maxPrice= type.stream()
				.filter(p -> p.getPrice() <= 100000).findFirst();
		 if (maxPrice.isPresent()) {
				System.out.println(maxPrice);

			}
	System.out.println("========Get All ProductDTO by type Sort  by price in des========");
   Optional<Boolean> des=type.stream().sorted((a,b)->b.getPrice().compareTo(a.getPrice()) ).map(e-> e.getType()
    		.equals(ProductType.ELETRONIC)).findFirst();
 if(des.isPresent())
 {
	 System.out.println(des);
 }
	System.out.println("========Get All ProductDTO  Sorted  by quantity in des========");

	List<ProductDTO> desc= type.stream().sorted((a,b)->b.getQuantity().compareTo(a.getQuantity()))
			.collect(Collectors.toList());
	desc.forEach(e-> System.out.println(e));
	
	List<String> names=new ArrayList<String>();
	names.add("Lahari");
	names.add("Chandana");
	names.add("Thanusha");
	names.add("Nandini");
	names.add("Amit");
	System.out.println("* Using ListIterator Forward *");
	
	ListIterator<String> listItr= names.listIterator(1);
	while(listItr.hasPrevious())
	{
		String e=listItr.previous();
		System.out.println(e);
	}
	
	System.out.println("* Using ListIterator Backward *");
	ListIterator<String> listItrBackward=names.listIterator(4);
	while(listItrBackward.hasPrevious())
	{
		String e=listItrBackward.previous();
		System.out.println(e);
	}
} 
}

