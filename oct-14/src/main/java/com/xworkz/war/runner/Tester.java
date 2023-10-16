package com.xworkz.war.runner;



import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.war.dto.CountryDTO;
import com.xworkz.war.dto.PresidentDTO;
import com.xworkz.war.dto.WarDTO;

public class Tester {

	public static void main(String[] args) {
		
		
		List<CountryDTO> country=new LinkedList<CountryDTO>();
		List<PresidentDTO> collection=new LinkedList<PresidentDTO>();
		PresidentDTO president1=new PresidentDTO(1, "Kim Il Sung", 38, "(1950-06-25,23:54:19)", "(1953-07-27,19:58:45)");
		PresidentDTO president2=new PresidentDTO(2, "Dwight Eisenhower's", 46, "(1950-06-25,23:54:19)", "(1953-07-27,19:58:45)");
		PresidentDTO president3=new PresidentDTO(3, "Lester Pearson", 53, "(1950-06-25,23:54:19)", "(1953-07-27,19:58:45)");
		PresidentDTO president4=new PresidentDTO(4, "Jacinda Ardern", 37, "(1950-06-25,23:54:19)", "(1953-07-27,19:58:45)");
		
		
		collection.add(president1);
		collection.add(president2);
		collection.add(president3);
		collection.add(president4);
		
		CountryDTO country1=new CountryDTO("South Korea", 1, "Asia", president1);
		CountryDTO country2=new CountryDTO("NorthKorea", 2, "Asia", president2);
		CountryDTO country3=new CountryDTO("Canada", 3, "North  America", president3);
		CountryDTO country4=new CountryDTO("New Zealand", 4, "Australia", president4);
		
		country.add(country1);
		country.add(country2);
		country.add(country3);
		country.add(country4);
		
		Set<WarDTO> war=new HashSet<WarDTO>();
		WarDTO dto1=new WarDTO(1, "Korean War", country, "North Korea");
		war.add(dto1);
		war.stream().sorted().forEach(e-> System.out.println( e));
		
		
		System.out.println("======War 2=============");
		

		List<PresidentDTO> collection1=new ArrayList<PresidentDTO>();
		PresidentDTO president5=new PresidentDTO(5, "Paul von Hindenburg", 67, "(1914-07-28,08:00:19)", "(1918-11-11,08:58:45)");
		PresidentDTO president6=new PresidentDTO(6, "Franklin Delano Roosevelt ", 32, "(1914-07-28,08:00:19)", "(1918-11-11,08:58:45)");
		PresidentDTO president7=new PresidentDTO(7, "H. H. Asquith", 50, "(1914-07-28,08:00:19)", "(1918-11-11,08:58:45)");
		PresidentDTO president8=new PresidentDTO(8, "Taishō", 69, "(1914-07-28,08:00:19)", "(1918-11-11,08:58:45)");
		PresidentDTO president9=new PresidentDTO(9, "Nicholas II", 40,"(1914-07-28,08:00:19)", "(1918-11-11,08:58:45)");
		PresidentDTO president10=new PresidentDTO(10,"Raymond Poincaré", 54, "(1914-07-28,08:00:19)", "(1918-11-11,08:58:45)");

		collection1.add(president5);
		collection1.add(president6);
		collection1.add(president7);
		collection1.add(president8);
		collection1.add(president9);
		collection1.add(president10);
		
		List<CountryDTO> coun=new LinkedList<CountryDTO>();
		CountryDTO country5=new CountryDTO("Germany", 5, "Asia",president5);
		CountryDTO country6=new CountryDTO("U.S.A", 6, "North America", president6);
		CountryDTO country7=new CountryDTO("U.K", 7, "Europe", president7);
		CountryDTO country8=new CountryDTO("Japan", 8, "Europe", president8);
		CountryDTO country9=new CountryDTO("Russia", 9, "Europe And Northen Asia", president9);
		CountryDTO country10=new CountryDTO("France",10, "Europe",president10);
		
		coun.add(country5);
		coun.add(country6);
		coun.add(country7);
		coun.add(country8);
		coun.add(country9);
		coun.add(country10);
		
		List<WarDTO> war1=new LinkedList<WarDTO>();
		WarDTO dto2=new WarDTO(2, "World War1", coun, "(U.K),(U.S.A),France");
		war1.add(dto2);
		war1.stream().sorted().forEach(e-> System.out.println(e));
		System.out.println("*************");
		
		System.out.println("======War 3=============");
		List<PresidentDTO> collection2=new ArrayList<PresidentDTO>();
		PresidentDTO president11=new PresidentDTO(11, "Ho Chi Minh", 65, "(1955-11-1,08:00:19)", "(1975-04-30,08:58:45)");
		PresidentDTO president12=new PresidentDTO(12, "Dwight D. Eisenhower ", 49, "(1955-11-1,08:00:19)", "(1975-04-30,08:58:45)");
		
		collection2.add(president11);
		collection2.add(president12);
		
		List<CountryDTO> coun1=new LinkedList<CountryDTO>();
		CountryDTO country12=new CountryDTO("Chaina", 11, "Asia",president11);
		CountryDTO country13=new CountryDTO("U.S.A", 12, "North America", president12);
		
		coun1.add(country12);
		coun1.add(country13);
		
			List<WarDTO> war2=new LinkedList<WarDTO>();
		WarDTO dto3=new WarDTO(3, "Vietnam War", coun1, "U.S.A");
		war2.add(dto3);
		war2.stream().sorted().forEach(e-> System.out.println(e));
		
		System.out.println("======War 4=============");
		List<PresidentDTO> collection3=new ArrayList<PresidentDTO>();
		PresidentDTO president13=new PresidentDTO(13, "George Washington", 65, "(1754-05-28,08:00:19)", "(1763-02-10,08:58:45)");
		PresidentDTO president14=new PresidentDTO(14, "Emmanuel Macron", 42, "(1754-05-28,08:00:19)", "(1763-02-10,08:58:45)");
		
		collection3.add(president13);
		collection3.add(president14);
		
		List<CountryDTO> coun2=new LinkedList<CountryDTO>();

		CountryDTO country14=new CountryDTO("U.K", 13, "Europe", president13);
		CountryDTO country15=new CountryDTO("France", 14, "Europe", president14);
		
		
		coun2.add(country14);
		coun2.add(country15);
		
	
		List<WarDTO> war3=new LinkedList<WarDTO>();
		WarDTO dto4=new WarDTO(3, "French and Indian War", coun2, "British");
		war3.add(dto4);
		war3.stream().sorted().forEach(e-> System.out.println(e));
		
		System.out.println("======War 5=============");
		List<PresidentDTO> collection4=new ArrayList<PresidentDTO>();
		PresidentDTO president15=new PresidentDTO(15, "Jefferson Davis", 53, "(1861-04-12,08:00:19)", "(1865-05-26,08:58:45)");
		PresidentDTO president16=new PresidentDTO(16, "Abraham Lincoln", 25,"(1861-04-12,08:00:19)", "(1865-05-26,08:58:45)");
		
		collection4.add(president15);
		collection4.add(president16);
		
		
		List<CountryDTO> coun3=new LinkedList<CountryDTO>();

		CountryDTO country16=new CountryDTO("C.S.A", 16, "North America", president15);
		CountryDTO country17=new CountryDTO("U.S.A",17, "North America",president16);
		
		coun3.add(country16);
		coun3.add(country17);
		
		List<WarDTO> war4=new LinkedList<WarDTO>();
		WarDTO dto5=new WarDTO(5, "American Civil War", coun3, "United States");
		war4.add(dto5);
		war4.stream().sorted().forEach(e-> System.out.println(e));
		
		System.out.println("======War 6=============");
		List<PresidentDTO> collection5=new ArrayList<PresidentDTO>();
		PresidentDTO president17=new PresidentDTO(17, "Vladimir Putin", 71, "(2022-02-24,08:00:19)", "(present)");
		PresidentDTO president18=new PresidentDTO(18, "Zelensky", 45,"(2022-02-24,08:00:19)", "(present)");
		
		collection5.add(president17);
		collection5.add(president18);
		
		
		List<CountryDTO> coun4=new LinkedList<CountryDTO>();

		CountryDTO country18=new CountryDTO("Russia", 18, "Europe & North Asia", president17);
		CountryDTO country19=new CountryDTO("Ukraine",19, "Europe",president18);
		
		coun4.add(country18);
		coun4.add(country19);
		
		List<WarDTO> war5=new LinkedList<WarDTO>();
		WarDTO dto6=new WarDTO(6, "Russian invasion of Ukraine", coun4, "not yet declare");
		war5.add(dto6);
		war5.stream().sorted().forEach(e-> System.out.println(e));
		
		System.out.println("======War 7=============");
		List<PresidentDTO> collection6=new ArrayList<PresidentDTO>();
		PresidentDTO president19=new PresidentDTO(19, "George H. W. Bush", 58, "(1950-08-2,08:00:19)", "(1991-02-28,08:58:45)");
		PresidentDTO president20=new PresidentDTO(20, "Saddam Hussein", 55,"(1950-08-2,08:00:19)", "(1991-02-28,08:58:45)");
		
		collection6.add(president19);
		collection6.add(president20);
		
		
		List<CountryDTO> coun5=new LinkedList<CountryDTO>();

		CountryDTO country20=new CountryDTO("U.S.A", 20, "Asia", president19);
		CountryDTO country21=new CountryDTO("Iraq",21, "Asia",president20);
		
		coun5.add(country20);
		coun5.add(country21);
		
		List<WarDTO> war6=new LinkedList<WarDTO>();
		WarDTO dto7=new WarDTO(7, "Gulf War", coun5, "U.S.A");
		war6.add(dto6);
		war6.stream().sorted().forEach(e-> System.out.println(e));
		
		List<WarDTO> data=new ArrayList<WarDTO>();
		
		data.add(dto1);
		data.add(dto2);
		data.add(dto3);
		data.add(dto4);
		data.add(dto5);
		data.add(dto6);
		data.add(dto7);

		System.out.println("*************");
		
		List<CountryDTO> country11= coun.stream().sorted((a1,a2)-> a2.getCountriesParticipated().compareTo(a1.getCountriesParticipated())).collect(Collectors.toList());
		country11.forEach(e-> System.out.println(e.getPresidentDTO()));
		
		System.out.println("*********************");
		
		List<PresidentDTO> name=collection1.stream().sorted().collect(Collectors.toList());
		name.forEach(e-> System.out.println(e.getName()));
	
		System.out.println("****************************");
		List<CountryDTO> name1=country.stream().sorted().collect(Collectors.toList());
		name1.forEach(e-> System.out.println(e.getCountriesParticipated()));

		System.out.println("*******************************");
		List<PresidentDTO> startTime=collection1.stream().sorted().collect(Collectors.toList());
		startTime.forEach(e-> System.out.println(e.getLocalDateTime()));

		System.out.println("********************************");
		List<PresidentDTO> endTime=collection1.stream().sorted().collect(Collectors.toList());
		endTime.forEach(e-> System.out.println(e.getLocalDateTime1()));
		
		System.out.println("****************************");
		Set<CountryDTO> continent=country.stream().sorted().collect(Collectors.toSet());
		continent.forEach(e-> System.out.println(e.getContinent()));

	}

}
