package com.xworkz.temple.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.temple.dto.TempleDTO;

public class ControllerTest {

	public static void main(String[] args) {
		
	
		TempleDTO dto=new TempleDTO("Veerabhadra", "Lepakshi", "Veerabhadra", 1988, "Devaraya");
		TempleDTO dto1=new TempleDTO("GoldenTemple", "TamilNaidu", "Lakshmi", 1984, "Narayani");
		TempleDTO dto2=new TempleDTO("VenkateswaraTemple", "Tirumala", "Venkateswara", 1990, "Devaraya");
		TempleDTO dto3=new TempleDTO("Vinayaka", "Kanipakam", "Vinayaka", 1986, "Kulotunga");
		TempleDTO dto4=new TempleDTO("Vinayaka", "Kanipakam", "Vinayaka", 1986, "Kulotunga");

		Collection<TempleDTO> collection=new HashSet<TempleDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
        System.out.println("TotalTemple:"+collection.size());
       for(TempleDTO Dto:collection)
       {
    	   System.out.println(Dto.getName()+":"+dto.getMainGod());
    	  
       }
       
       System.out.println("Iterator");
       Iterator<TempleDTO> iterator=collection.iterator();
       while(iterator.hasNext())
       {
    	   TempleDTO element=iterator.next();
    	   System.out.println(element.getName());
    	   
    	   if(element.getName().equals("VenkateswaraTemple"));
    	   iterator.remove();
       }
	}

}
