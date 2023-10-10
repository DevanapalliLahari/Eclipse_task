package com.xworkz.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.dto.PlayerDTO;
import com.xworkz.option.PlayerSport;

public class PlayerTest {
	public static void main(String[] args) {
     PlayerDTO dto=new PlayerDTO("Bhumra", 93, "India", PlayerSport.CRICKET, 29);
     PlayerDTO dto1=new PlayerDTO("Warner", 31, "Australia", PlayerSport.CRICKET,36 );
     PlayerDTO dto2=new PlayerDTO("Dhoni", 7, "India", PlayerSport.CRICKET, 42);
     PlayerDTO dto3=new PlayerDTO("P.V.Sindu", 2, "India", PlayerSport.BADMINTION, 28);
     PlayerDTO dto4=new PlayerDTO("Yamaguchi", 3, "Japan", PlayerSport.BADMINTION, 25);
     PlayerDTO dto5=new PlayerDTO("Park Kyung-mo", 17, "South Korea", PlayerSport.ARCHERY, 48);
     PlayerDTO dto6=new PlayerDTO("Kim Soo Nyung", 4, "South Korea", PlayerSport.ARCHERY, 52);
     PlayerDTO dto7=new PlayerDTO("Andre Ward", 8, "America", PlayerSport.BOXING, 39);
     PlayerDTO dto8=new PlayerDTO("Devin Haney", 10, "America", PlayerSport.BOXING, 23);
     PlayerDTO dto9=new PlayerDTO("Ronaldo", 17, "Portugal", PlayerSport.FOOTBALL, 38);
     PlayerDTO dto10=new PlayerDTO("Karim ", 9, "france", PlayerSport.FOOTBALL, 22);
     PlayerDTO dto11=new PlayerDTO("Robert", 14, "poland", PlayerSport.FOOTBALL, 26);
     PlayerDTO dto12=new PlayerDTO("Virat Kholi", 18, "India", PlayerSport.CRICKET,37);
     PlayerDTO dto13=new PlayerDTO("Surendra Kumar", 12, "India", PlayerSport.HOCKEY, 29);
     PlayerDTO dto14=new PlayerDTO("Connor MC David", 19, "Canadian", PlayerSport.HOCKEY, 26);
     PlayerDTO dto15=new PlayerDTO("Messy", 15, "Argentina", PlayerSport.FOOTBALL, 36);
     PlayerDTO dto16=new PlayerDTO("Ryan MC Donagh", 16, "America", PlayerSport.HOCKEY, 34);
     PlayerDTO dto17=new PlayerDTO("Jang Kun Lee", 13, "South Korea", PlayerSport.KABADDI, 30);
     PlayerDTO dto18=new PlayerDTO("G.R Vaishnav", 11, "India", PlayerSport.VOLLEYBALLL, 33);
     PlayerDTO dto19=new PlayerDTO("Rahul Chowdary", 20, "India", PlayerSport.KABADDI, 30);

     Collection<PlayerDTO> collection=new HashSet<PlayerDTO>();
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
     
     Collection<PlayerDTO> collection1=new  HashSet<PlayerDTO>();
     collection.forEach((p)->{
			if(p.getCountry().equalsIgnoreCase("India"))
			{
				System.out.println("The players related to India is:"+p.getName());
				collection1.add(p);
			}
			else
			{
				System.err.println("The players not related to India is:"+p.getName());
			}
			
		});
     collection1.forEach((d)->System.out.println(d));
     
     Collection<PlayerDTO> collection2=new  HashSet<PlayerDTO>();
     collection.forEach((s)->{
			if(s.getSport().equals(PlayerSport.CRICKET))
			{
				System.out.println("The players related to cricket:"+s.getSport());
				collection2.add(s);
			}
			else
			{
				System.err.println("The players not related to cricket:"+s.getSport());
			}
			
		});
     collection2.forEach((d)->System.out.println(d));
	
     Collection<PlayerDTO> collection3=new  HashSet<PlayerDTO>();
     collection.forEach((s)->{
			if(s.getAge()>=20&&s.getAge()<=30)
			{
				System.out.println("The age of player is :"+s.getAge());
				collection3.add(s);
			}
			else
			{
				System.err.println("The age of player is:"+s.getAge());
			}
			
		});
     collection3.forEach((d)->System.out.println(d));
     
     Collection<PlayerDTO> collection4=new  HashSet<PlayerDTO>();
     collection.forEach((s)->{
			if(s.getAge()>=20)
			{
				System.out.println("The players are:"+s.getName());
				collection4.add(s);
			}
			else
			{
				System.err.println("The players are:"+s.getName());
			}
			
		});
     collection4.forEach((e)->System.out.println(e));
     
     
    	 Iterator<PlayerDTO> iterator=collection.iterator();
         while(iterator.hasNext())
         {
      	   PlayerDTO element=iterator.next();
      	   System.out.println(element.getAge());
      	   
			if(element.getAge()>=40)
			{
				System.out.println("The players are:"+element.getName());
				iterator.remove();
				
			}
			
         }
			
		
     collection.forEach((e)->System.out.println(e));
	}
}
