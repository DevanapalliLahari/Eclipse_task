package com.xworkz.vegetable.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MobileRunner {
	public static void main(String[] args) {
		Collection<Long> collection = new HashSet<Long>();
		collection.add(9390777192L);
		collection.add(9390792007L);
		collection.add(8790292247L);
		collection.add(9963270442L);
		collection.add(9441665442L);
		collection.add(7809543213L);
		collection.add(8739473369L);
		collection.add(8752341943L);

		System.out.println("Total Mobile Numbers :" + collection.size());
		boolean data = collection.addAll(collection);
		System.out.println("addAll :" + data);
		boolean data1 = collection.isEmpty();
		System.out.println("isEmpty :" + data1);
		Iterator<Long> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Long element = iterator.next();
			System.out.println("Mobile Numbers :" + element);

		}
		boolean data2 = collection.remove(9441665442L);
		System.out.println("remove :" + data2);
		boolean data3 = collection.removeAll(collection);
		System.out.println("removeAll :" + data3);
		boolean data4 = collection.contains(9390777192L);
		System.out.println("contains :" + data4);
		boolean data5 = collection.containsAll(collection);
		System.out.println("containsAll :" + data5);

		boolean data6 = collection.retainAll(collection);
		System.out.println("retainAll :" + data6);

	}

}
