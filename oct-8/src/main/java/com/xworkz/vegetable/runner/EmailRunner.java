package com.xworkz.vegetable.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class EmailRunner {

	public static void main(String[] args) {
		Collection<String> collection = new HashSet<String>();
		collection.add("lahari@gmail.com");
		collection.add("chandana@gmail.com");
		collection.add("thanusha@gmail.com");
		collection.add("shilpa@gmail.com");
		collection.add("ram@gmail.com");
		collection.add("sam@gmail.com");
		collection.add("bob@gmail.com");
		collection.add("harini@gmail.com");
		collection.add("sasi@gmail.com");
		
		System.out.println("Total Emails :" + collection.size());
		boolean mail = collection.addAll(collection);
		System.out.println("addAll :" + mail);
		boolean mail1 = collection.isEmpty();
		System.out.println("isEmpty :" +mail1);
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println("Email :" + ele);

		}
		boolean mail2 = collection.remove("harini@gmail.com");
		System.out.println("remove :" + mail2);
		boolean mail3 = collection.removeAll(collection);
		System.out.println("removeAll :" + mail3);
		boolean mail4 = collection.contains("ram@gmail.com");
		System.out.println("contains :" + mail4);
		boolean mail5 = collection.containsAll(collection);
		System.out.println("containsAll :" + mail5);
		boolean mail6 = collection.retainAll(collection);
		System.out.println("retainAll :" + mail6);


	}

}
