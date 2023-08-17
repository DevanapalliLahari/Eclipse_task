package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.TheaterDTO;
import com.xworkz.operation.implementation.TheaterRepositoryImpl;
import com.xworkz.operation.repository.TheaterRepository;

public class TheaterRunner {

	public static void main(String[] args) {
     System.out.println("Running main");
     TheaterDTO theaterDTO=new TheaterDTO("Imax", "Salar", 250, 300, 500);
     System.out.println(theaterDTO.toString());
     System.out.println();
     
     TheaterDTO theaterDTO1=new TheaterDTO("CTC", "Jailar", 200, 350, 250);
     System.out.println(theaterDTO1.toString());
     System.out.println();
     
     TheaterDTO theaterDTO2=new TheaterDTO("PVR", "Baby", 300, 300, 400);
     System.out.println(theaterDTO2.toString());
     System.out.println();
     
     TheaterDTO theaterDTO3=new TheaterDTO("Tri Veni", "Spy", 280, 300, 300);
     System.out.println(theaterDTO3.toString());
     System.out.println();
     
     TheaterDTO theaterDTO4=new TheaterDTO("Rk", "Bro", 300, 400, 300);
     System.out.println(theaterDTO4.toString());
     System.out.println();
     
     
     TheaterRepository repository=new TheaterRepositoryImpl();
     repository.save(theaterDTO);
     System.out.println();
     
     TheaterRepository repository1=new TheaterRepositoryImpl();
     repository1.save(theaterDTO1);
     System.out.println();
     
     TheaterRepository repository2=new TheaterRepositoryImpl();
     repository2.save(theaterDTO2);
     System.out.println();
     
     TheaterRepository repository3=new TheaterRepositoryImpl();
     repository3.save(theaterDTO3);
     System.out.println();
     
     TheaterRepository repository4=new TheaterRepositoryImpl();
     repository4.save(theaterDTO4);
     System.out.println();
	}

}
