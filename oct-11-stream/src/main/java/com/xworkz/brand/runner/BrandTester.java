package com.xworkz.brand.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

import com.xworkz.brand.dto.BrandDTO;

public class BrandTester {

	public static void main(String[] args) {
     BrandDTO dto1=new BrandDTO("Google","Sundar",720.0,"USA");
     BrandDTO dto2=new BrandDTO("Apple","Tim Cook",81.8,"USA");
     BrandDTO dto3=new BrandDTO("Puma","Kering",9.35,"Germany");
     BrandDTO dto4=new BrandDTO("Tesla","Elon Mask",24.927,"USA");
     BrandDTO dto5=new BrandDTO("Ikea","Ingvar Kamprad's",39.6,"Japan");
     BrandDTO dto6=new BrandDTO("Adidas","Adi",23.300,"Germany");
     BrandDTO dto7=new BrandDTO("Prada","Miuccia Prada",16.45,"Italy");
     BrandDTO dto8=new BrandDTO("MicroSoft","Sathya Nadella",211915,"USA");
     BrandDTO dto9=new BrandDTO("Avasa","Abhimanyu",109.83,"India");
     BrandDTO dto10=new BrandDTO("Fyita","Max Keith",51.22,"Chaina");

     Collection<BrandDTO> collection= new HashSet<BrandDTO>();
     collection.add(dto1);
     collection.add(dto2);
     collection.add(dto3);
     collection.add(dto4);
     collection.add(dto5);
     collection.add(dto6);
     collection.add(dto7);
     collection.add(dto8);
     collection.add(dto9);
     collection.add(dto10);
     
    collection.stream().sorted().forEach((e)-> System.out.println(e));
    
    System.out.println("===========");
    collection.stream().sorted().forEach((e)->{
    	if(e.getRevenueInBillion()>20 )
    	{
    		System.out.println(e);
    	}
    	
    });
    System.out.println("===========");
    collection.stream().sorted().forEach((e)->{
    	if(e.getRevenueInBillion()<20 )
    	{
    		System.out.println(e);
    	}
    });
    System.out.println("===========");
    Collection<BrandDTO> collection1=new HashSet<BrandDTO>();
    collection.stream().sorted().forEach((e)->{
    	if(e.getCountry().equalsIgnoreCase("USA"))
    	{
    		System.out.println(e);
    		collection1.add(e);
    	}
    });
System.out.println("==================");
    Collection<BrandDTO> collection2=new HashSet<BrandDTO>();
    collection.stream().sorted().forEach((e)->{
    	if(!e.getCountry().equalsIgnoreCase("USA"))
    	{
    		System.out.println(e);
    		collection2.add(e);
    	}
    	
    });
    System.out.println("===================");
    Collection<BrandDTO> collection3=new HashSet<BrandDTO>();
    collection.stream().sorted().forEach((e)->{
    	if(e.getName().startsWith("I"))
    	{
    		System.out.println(e);
    		collection3.add(e);
    	}
    });
    System.out.println("================");
    Collection<BrandDTO> collection4=new HashSet<BrandDTO>();
    collection.stream().sorted().forEach((e)->{
    	if(e.getOwner().length()>5)
    	{
    		System.out.println(e);
    		collection4.add(e);
    	}
    });
    
    System.out.println("================");
    Collection<BrandDTO> collection5=new HashSet<BrandDTO>();
    collection.stream().sorted().forEach((e)->{
    	if(e.getOwner().length()<5)
    	{
    		System.out.println(e);
    		collection5.add(e);
    	}
    });

	}
  }
