package com.xworkz.actor.dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ActorTest {

	public static void main(String[] args) {
		ActorDTO dto=new ActorDTO(1,"Prabash","telugu","male","India");
		ActorDTO dto1=new ActorDTO(2,"Anuska","telugu","female","India");
		ActorDTO dto2=new ActorDTO(3,"Yang Yang","Chinese","male","Chaina");
		ActorDTO dto3=new ActorDTO(4,"Zha Lusi","Chinesa","female","Chaina");
		ActorDTO dto4=new ActorDTO(5,"Le Min Hoo","Korean","male","Korea");
		ActorDTO dto5=new ActorDTO(6,"Jin","Korean","male","Korea");
		ActorDTO dto6=new ActorDTO(7,"Jerry Yan","Turkish","male","Turkey");
		ActorDTO dto7=new ActorDTO(8,"Sharukh Khan","Hindi","male","India");
		ActorDTO dto8=new ActorDTO(9,"Lisa","korean","female","Korea");
		ActorDTO dto9=new ActorDTO(10,"Priyanka Chopra","Hindi","female","India");


Collection<ActorDTO> collection=new HashSet<ActorDTO>();
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

collection.stream()
.sorted((a1,a2) ->a2.getName().compareTo(a1.getName()))
		.collect(Collectors.toList())
		.forEach(e-> System.out.println(e.getName()));
System.out.println("======Countries in upper case=========");
Set<String> country=collection.stream().map(ele-> ele.getCountry().toUpperCase()).sorted().collect(Collectors.toSet());
country.stream().forEach(e-> System.out.println(e));
System.out.println("===========Actors id in asc order===========");
Set<ActorDTO> id1=(Set<ActorDTO>) collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId())).collect(Collectors.toSet());
id1.forEach(e-> System.out.println(e.getId()+"="+e.getName()));

System.out.println("======filter all males=====");
	List<ActorDTO> gender1=collection.stream().filter(e-> e.getGender().equals("male")).collect(Collectors.toList());
			gender1.stream().forEach(e->System.out.println(e.getName()+"="+e.getGender()));
	System.out.println("==========Actors asc order with  lang known===========");
	List<ActorDTO> lang=collection.stream().sorted((a1,a2)-> a1.getLangKnown().compareTo(a2.getLangKnown())).collect(Collectors.toList());
			lang.forEach(e-> System.out.println(e.getLangKnown()));

	System.out.println("==========Actors desc order with  lang known===========");
	List<ActorDTO> lang1=collection.stream().sorted((a1,a2)-> a2.getLangKnown().compareTo(a1.getLangKnown())).collect(Collectors.toList());
			lang1.forEach(e-> System.out.println(e.getLangKnown()));
	System.out.println("===Female Actors in desc order=====");
	 Set<ActorDTO>gender=collection.stream() .filter(e-> e.getGender().equals("female")).collect(Collectors.toSet());
			 gender.stream().sorted((a1,a2)->a2.getGender().compareTo(a1.getGender())).forEach(e-> System.out.println(e.getGender()+"="+e.getName()));
   System.out.println("=======All the countries and Count=======");
   List<ActorDTO> countries = collection.stream().sorted().filter((e) -> e.getCountry().equals("India")).collect(Collectors.toList());
	countries.forEach(e -> System.out.println(e));
	System.out.println("Count :" + countries.size());
	System.out.println("=====Actors id is greater than 5======");
	List<ActorDTO> id=collection.stream().filter(e-> e.getId()>5).collect(Collectors.toList());
	id.stream().sorted((a1,a2)-> a1.getId().compareTo(a2.getId())).forEach(e-> System.out.println( e.getId()+"="+e.getName()));
			
	}
}
