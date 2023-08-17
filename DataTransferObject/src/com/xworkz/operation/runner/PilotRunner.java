package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.PilotDTO;
import com.xworkz.operation.implementation.PilotRepositoryImpl;
import com.xworkz.operation.repository.PilotRepository;

public class PilotRunner {

	public static void main(String[] args) {
System.out.println("Running main");
PilotDTO pilot=new PilotDTO("Rajan", 50000,"Bangloore",29, 5.2);
System.out.println(pilot.toString());
System.out.println();

PilotDTO pilot1=new PilotDTO("Subha", 60000,"Hyderabad",27, 5.3);
System.out.println(pilot1.toString());
System.out.println();

PilotDTO pilot2=new PilotDTO("Santhoosh", 70000,"Mumbai",30, 5.5);
System.out.println(pilot2.toString());
System.out.println();

PilotDTO pilot3=new PilotDTO("Anjali", 50000,"Chennai",28, 5.8);
System.out.println(pilot3.toString());
System.out.println();

PilotDTO pilot4=new PilotDTO("Sobhan", 60000,"Delhi",26, 5.11);
System.out.println(pilot4.toString());
System.out.println();

PilotRepository repository=new  PilotRepositoryImpl();
repository.save(pilot);
System.out.println();

PilotRepository repository1=new  PilotRepositoryImpl();
repository1.save(pilot1);
System.out.println();

PilotRepository repository2=new  PilotRepositoryImpl();
repository2.save(pilot2);
System.out.println();

PilotRepository repository3=new  PilotRepositoryImpl();
repository3.save(pilot3);
System.out.println();

PilotRepository repository4=new  PilotRepositoryImpl();
repository4.save(pilot4);
System.out.println();
	}

}
