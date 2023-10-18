package com.xworkz.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.dto.PassportDTO;
import com.xworkz.dto.PassportType;
import com.xworkz.dto.PersonDTO;

public class MobileTester {

	public static void main(String[] args) {
		Map<Long, String> mobileNo = new HashMap<Long, String>();

		mobileNo.put(9390777192L, "Lahari");
		mobileNo.put(9390792007L, "Chandana");
		mobileNo.put(9963270442L, "Shiva");
		mobileNo.put(9441665442L, "Ram");
		mobileNo.put(8790292247L, "Lakshmi");
		mobileNo.put(8520879694L, "Vani");
		mobileNo.put(9493018468L, "Bhanu");
		mobileNo.put(7353003622L, "Vishnu");
		mobileNo.put(7989771725L, "Thanusha");
		mobileNo.put(7993336528L, "Suma");
		mobileNo.put(9741519944L, "Madhan");
		mobileNo.put(9019122426L, "Seetha");
		mobileNo.put(9390522020L, "Nandini");
		mobileNo.put(8688672701L, "Sravani");
		mobileNo.put(9740023809L, "Nayana");
		mobileNo.put(9121660683L, "Ramana");
		mobileNo.put(9632216223L, "Meenashi");
		mobileNo.put(8143630916L, "Shilpa");
		mobileNo.put(6281373090L, "Sai");
		mobileNo.put(9502031513L, "Kiran");
         
		System.out.println("=========Collect all names less than  10char========");
		mobileNo.values().stream().sorted().filter(e -> e.length() < 10).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("==========Collect all names greater than 10char=============");

		mobileNo.values().stream().sorted().filter(e -> e.length() > 10).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("=======Collect all names in uppercase==========");
		mobileNo.values().stream().map(e -> e.toUpperCase()).sorted().collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("=======Collect all numbers ends with 0======");
		List<Long> number = mobileNo.keySet().stream().filter(e -> e.toString().endsWith("0")).sorted()
				.collect(Collectors.toList());
		number.forEach(e -> System.out.println(e));
		System.out.println("======Collect all numbers starts with 8=====");
		List<Long> num = mobileNo.keySet().stream().filter(e -> e.toString().startsWith("8")).sorted()
				.collect(Collectors.toList());
		num.forEach(e -> System.out.println(e));

		PersonDTO person1 = new PersonDTO(1, "John", "john@gmail.com", 9390777192L);
		PersonDTO person2 = new PersonDTO(1, "Alice Johnson", "alice@example.com", 9390792007L);
		PersonDTO person3 = new PersonDTO(2, "Bob Smith", "bob@example.com", 8790292247L);
		PersonDTO person4 = new PersonDTO(3, "Ella Davis", "ella@example.com", 9441665442L);
		PersonDTO person5 = new PersonDTO(4, "Vendor Corp", "vendor@example.com", 9963270442L);
		PersonDTO person6 = new PersonDTO(5, "David Wilson", "david@example.com", 9740023809L);
		PersonDTO person7 = new PersonDTO(6, "Supply Co.", "supply@example.com", 7989771725L);
		PersonDTO person8 = new PersonDTO(7, "Michael Brown", "michael@example.com", 7207432590L);
		PersonDTO person9 = new PersonDTO(8, "Event Pro", "organizer@example.com", 7993336528L);
		PersonDTO person10 = new PersonDTO(10, "Volunteer Name", "volunteer@example.com", 7353003622L);

		PassportDTO passport1 = new PassportDTO(1, "R1239876", LocalDate.of(2023, 07, 13), "Retirement Travel Co.",
				LocalDate.of(2025, 07, 01), PassportType.EMIGRATION_PASSPORT);
		PassportDTO passport2 = new PassportDTO(2, "X7654321", LocalDate.of(2018, 8, 17), "Expedited Services",
				LocalDate.of(2023, 04, 01), PassportType.DARK_BLUE_PERSONAL_PASSPORT);
		PassportDTO passport3 = new PassportDTO(3, "T8765432", LocalDate.of(2007, 12, 01), "Transit Authorities",
				LocalDate.of(2015, 01, 20), PassportType.EMIGRATION_PASSPORT);
		PassportDTO passport4 = new PassportDTO(4, "E1234567", LocalDate.of(2014, 07, 10), "Emergency Services",
				LocalDate.of(2018, 9, 24), PassportType.SERVICE_PASSPORT);
		PassportDTO passport5 = new PassportDTO(5, "O2345678", LocalDate.of(2011, 11, 22), "Government Office",
				LocalDate.of(2019, 06, 18), PassportType.DIPLOMATIC_PASSPORT);
		PassportDTO passport6 = new PassportDTO(6, "F7890123", LocalDate.of(2017, 02, 11), "Family Travel Agency",
				LocalDate.of(2024, 12, 15), PassportType.DARK_BLUE_PERSONAL_PASSPORT);
		PassportDTO passport7 = new PassportDTO(7, "D4321098", LocalDate.of(2021, 03, 17), "Foreign Affairs Department",
				LocalDate.of(2026, 05, 03), PassportType.DIPLOMATIC_PASSPORT);
		PassportDTO passport8 = new PassportDTO(8, "B9876543", LocalDate.of(2009, 05, 14), "Business Corporation",
				LocalDate.of(2014, 02, 26), PassportType.SERVICE_PASSPORT);
		PassportDTO passport9 = new PassportDTO(9, "A1234567", LocalDate.of(2012, 10, 13), "Government of Country",
				LocalDate.of(2022, 07, 01), PassportType.EMIGRATION_PASSPORT);
		PassportDTO passport10 = new PassportDTO(10, "S5678901", LocalDate.of(2019, 4, 29), "Ministry of Education",
				LocalDate.of(2023, 12, 30), PassportType.DIPLOMATIC_PASSPORT);

		Map<PersonDTO, PassportDTO> DTO = new HashMap<PersonDTO, PassportDTO>();
		DTO.put(person1, passport1);
		DTO.put(person2, passport2);
		DTO.put(person3, passport3);
		DTO.put(person4, passport4);
		DTO.put(person5, passport5);
		DTO.put(person6, passport6);
		DTO.put(person7, passport7);
		DTO.put(person8, passport8);
		DTO.put(person9, passport9);
		DTO.put(person10, passport10);
		System.out.println("======Collect All personDTO=======");
		List<PersonDTO> data = DTO.keySet().stream().collect(Collectors.toList());
		data.forEach(e -> System.out.println(e));

		System.out.println("========Collect all passportDTO========");
		List<PassportDTO> data1 = DTO.values().stream().collect(Collectors.toList());
		data1.forEach(e -> System.out.println(e));
		System.out.println("=========Collect passportDTO by type=======");
		List<PassportDTO> type = DTO.values().stream()
				.filter(e -> e.getType().equals(PassportType.DARK_BLUE_PERSONAL_PASSPORT)).collect(Collectors.toList());
		type.forEach(System.out::println);
		System.out.println("======Collect all Passport by issuedDate is less than today's date  and expired date======");
		Set<PassportDTO> issuedDate = DTO.values().stream()
		.filter(e -> e.getIssueDate().isBefore(LocalDate.now())&& e.getExpiredDate().isBefore(LocalDate.now()))
		.collect(Collectors.toSet());
		issuedDate.forEach(System.out::println);
		System.out.println("=======Collect all Experied passport=====");
		List<PassportDTO> date1 = DTO.values().stream()
				.filter(e -> e.getExpiredDate().isBefore(LocalDate.now()))
				.collect(Collectors.toList());
		date1.forEach(System.out::println);
		System.out.println("========Get passport by  number========");
		Optional<PassportDTO> number1 = DTO.values().stream().
				filter(e -> e.getPassportNo().equals("E1234567")).findFirst();
		if(number1.isPresent())
		{
			System.out.println(number1.get());
		}
		
		System.out.println("======Get person by name======");


		Optional<PersonDTO> name=DTO.keySet().stream().filter(e-> e.getName().equals("Vendor Corp")).findFirst();
		if(name.isPresent())
		{
			System.out.println(name.get());
		}
	}

}
