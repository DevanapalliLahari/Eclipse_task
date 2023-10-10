package com.xworkz.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.dto.MovieDTO;
import com.xworkz.dto.PlayerDTO;
import com.xworkz.option.MovieLanguage;

public class MovieRunnner {

	public static void main(String[] args) {
     MovieDTO dto=new MovieDTO("Bhahubali2", 1,MovieLanguage.TELUGU, "Prasad Devineni", "RajaMouli", 250);
     MovieDTO dto1=new MovieDTO("K.G.F", 2,MovieLanguage.KANNADA, "Vijay Kirgandur", "Prasanth neil", 100);
     MovieDTO dto2=new MovieDTO("RRR", 3,MovieLanguage.TELUGU, "D.V.V.Danayya", "RajaMouli", 550);
     MovieDTO dto3=new MovieDTO("Jawan", 4,MovieLanguage.HINDI, "Gowri Khan", "Atle Kumar", 300);
     MovieDTO dto4=new MovieDTO("Patan", 5,MovieLanguage.HINDI,"Aditya Chopra", "Siddarth Anand", 250);
     MovieDTO dto5=new MovieDTO("Gadhar", 6,MovieLanguage.HINDI, "Nitin Keni", "Anil Sharma", 75);
     MovieDTO dto6=new MovieDTO("Bhahubhali", 7,MovieLanguage.TELUGU, "Prasad Devineni", "RajaMouli", 180);
     MovieDTO dto7=new MovieDTO("Avaatar", 8,MovieLanguage.ENGLISH, "James Cameron", "James Cameron", 3200);
     MovieDTO dto8=new MovieDTO("Dangal", 9,MovieLanguage.HINDI, "Amir Khan", "Niteshh Tiwari", 70);
     MovieDTO dto9=new MovieDTO("Jailar", 10,MovieLanguage.TAMIL, "Maran", "Nelson", 200);
     MovieDTO dto10=new MovieDTO("Kanthara", 11,MovieLanguage.KANNADA, "Vijay Kikandur", "Rishad Setty", 16);
     MovieDTO dto11=new MovieDTO("Varisu", 12,MovieLanguage.TAMIL, "Dil Raju", "Vamsi Paidipalli", 200);
     MovieDTO dto12=new MovieDTO("Bheesma Parvam", 13,MovieLanguage.MALAYALAM, "Amal Neerad", "Amal Neerad", 15);
     MovieDTO dto13=new MovieDTO("Charle", 14,MovieLanguage.MALAYALAM, "Martin", "Gopi Sundhar", 420);
     MovieDTO dto14=new MovieDTO("Shibpur", 15,MovieLanguage.BENGALI, "Patel", "Arindam", 18);
     MovieDTO dto15=new MovieDTO("Chitta", 16,MovieLanguage.TAMIL, "Siddarth", "Arun Kumar", 80);
     MovieDTO dto16=new MovieDTO("Mirchi", 17,MovieLanguage.TELUGU, "Vamsi Krishna", "Koratala Shiva", 15);
     MovieDTO dto17=new MovieDTO("sir", 18,MovieLanguage.TAMIL, "Prakash", "Venky Attluri", 350);
     MovieDTO dto18=new MovieDTO("Bheesma", 19,MovieLanguage.TELUGU, "Dil Raju", "Venky Kudumula", 300);
     MovieDTO dto19=new MovieDTO("King Of Kotha", 20,MovieLanguage.MALAYALAM, "D.V.V.Danayya", "Abilash", 50);


     Collection<MovieDTO>collection=new HashSet<MovieDTO>();
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
     collection.add(dto10);
     collection.add(dto11);
     collection.add(dto12);
     collection.add(dto13);
     collection.add(dto14);
     collection.add(dto15);
     collection.add(dto16);
     collection.add(dto17);
     collection.add(dto18);
     collection.add(dto19);







     Collection<MovieDTO> collection1=new  HashSet<MovieDTO>();
     collection.forEach((m)->{
			if(m.getLang().equals(MovieLanguage.TELUGU))
			{
				System.out.println("The movie lang is  :"+m.getLang());
				collection1.add(m);
			}
			else
			{
				System.err.println("The movie lang is :"+m.getLang());
			}
			
		});
     collection1.forEach((d)->System.out.println(d));
     
     Collection<MovieDTO> collection2=new  HashSet<MovieDTO>();
     collection.forEach((p)->{
			if(p.getProducer().equalsIgnoreCase("Dilraj"))
			{
				System.out.println("The movie is produced by:"+p.getProducer());
				collection2.add(p);
			}
			else
			{
				System.err.println("The movie is not produced by:"+p.getProducer());
			}
			
		});
     collection2.forEach((d)->System.out.println(d));
     
     Collection<MovieDTO> collection3=new  HashSet<MovieDTO>();
     collection.forEach((p)->{
			if(p.getDirector().equalsIgnoreCase("Rajamouli"))
			{
				System.out.println("The movie is directed by:"+p.getDirector());
				collection3.add(p);
			}
			else
			{
				System.err.println("The movie is not directed by:"+p.getDirector());
			}
			
		});
     collection3.forEach((d)->System.out.println(d));
     
     Collection<MovieDTO> collection4=new  HashSet<MovieDTO>();
     collection.forEach((p)->{
			if(p.getBudgetInCrores()>=100)
			{
				System.out.println("The movie is :"+p.getName());
				collection4.add(p);
			}
			else
			{
				System.err.println("The movie is:"+p.getName());
			}
			
		});
     collection4.forEach((d)->System.out.println(d));
     
     Iterator<MovieDTO> iterator=collection.iterator();
     while(iterator.hasNext())
     {
  	   MovieDTO element=iterator.next();
  	   System.out.println(element.getBudgetInCrores());
  	   
		if(element.getBudgetInCrores()<=100)
		{
			System.out.println("The players are:"+element.getName());
			iterator.remove();
			
		}
		
     }
		
	
 collection.forEach((e)->System.out.println(e));
     
	}

}
