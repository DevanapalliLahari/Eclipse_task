package com.xworkz.app.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate past = LocalDate.of(2000, 02, 01);
		System.out.println(past);

		boolean check = localDate.isBefore(past);
		System.out.println(check);
		
		boolean check1=localDate.isAfter(past);
		System.out.println(check1);
		
		LocalDate future=LocalDate.of(2023, 10, 24);
		System.out.println(future);
		
		
		boolean check2=localDate.isAfter(future);
		System.out.println(check2);
		
		
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date);
		
		LocalDateTime past1=LocalDateTime.of(2002, 04, 23, 10, 54, 12, 9);
		System.out.println(past1);
		
		LocalDateTime future1=LocalDateTime.of(2023, 11, 18, 9, 12, 19, 9);
		System.out.println(future1);
		
		
		boolean check3=date.isAfter(past1);
		System.out.println(check3);
		
		boolean check4=date.isBefore(future1);
		System.out.println(check4);
	}
}
