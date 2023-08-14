package com.xworkz.country.implementation;

import com.xworkz.country.app.CountryRepository;

public class CountryRepositoryImpl implements CountryRepository {

	private String[] names = new String[TOTAL_COUNTRIES];
	private int index = 0;

	@Override
	public void save(String name) {
		if (index < TOTAL_COUNTRIES) {
			System.out.println("the element is:" + index + " is " + name);
			this.names[index] = name;
			index = index + 1;
			System.out.println("the next element is:" + index);
		} else {
			System.out.println("the array is full,can't store");
		}
	}

	public void display(String name) {
		for (index = 0; index < names.length; index++) {
			System.out.println("the element is:" + name);
		}
	}

	public boolean isExist(String name) {
		for (int start = 0; start < TOTAL_COUNTRIES; start++) {
			String string = this.names[start];
			if (string.equals(name)) {
				System.out.println("the element  is:" + name);
				return true;
			}

		}
		return false;

	}

	@Override
	public String findReturnUpperCase(String name) {
		for (int position = 0; position < TOTAL_COUNTRIES; position++) {
			String string = this.names[position];
			if (string.equals(name)) {
				System.out.println("the name is:" + name);
				return names[position].toUpperCase();
			}
		}
		return null;

	}

	@Override
	public String[] findStartsWith(String name) {
		String[] temp = new String[TOTAL_COUNTRIES];
		int index = 0;
		for (int pos = 0; pos < TOTAL_COUNTRIES; pos++) {
			String string = this.names[pos];
			if (string.startsWith(name)) {
				System.out.println("The name Starts with " + name);
				temp[index] = string;
				index = index + 1;
			}
		}
		return temp;
	}

	@Override
	public String[] findEndsWith(String name) {
		String[] temp = new String[TOTAL_COUNTRIES];
		int pos = 0;

		for (index = 0; index < TOTAL_COUNTRIES; index++) {
			String string = this.names[index];
			if (string.endsWith(name)) {
				temp[pos] = string;
				pos = pos + 1;
			}

		}

		return temp;

	}

	@Override
	public String[] findMatching(String name) {
		String[] temp = new String[TOTAL_COUNTRIES];
		int pos = 0;

		for (index = 0; index < TOTAL_COUNTRIES; index++) {
			String string = this.names[index];
			if (string.matches(name)) {
				temp[pos] = string;
				pos = pos + 1;
			}
		}
		return temp;

	}

	@Override
	public void orderDesc() {
		String[] temp = new String[TOTAL_COUNTRIES];
		String[] temp1 = names;
		for (int i = 0; i < TOTAL_COUNTRIES; i++) {
			for (int j = i + 1; j < TOTAL_COUNTRIES; j++) {
				
				if (names[i].compareTo(names[j])<0) {
					String temp2 = names[i];
					names[i] = names[j];
					names[j] = temp2;
				}
			}
			System.out.println("the descending order  is :"+names[i]);
		}
	

	}
	@Override
	public String[] orderAsc() {
		String[] temp = new String[TOTAL_COUNTRIES];

		for (int i = 0; i < TOTAL_COUNTRIES; i++) {
			for (int j = i + 1; j < TOTAL_COUNTRIES; j++) {
				
				if (names[i].compareTo(names[j])>0) {
					String temp2 = names[i];
					names[i] = names[j];
					names[j] = temp2;
				}
			}
			System.out.println("the ascending order  is :"+names[i]);
		}
		return temp;
	}
	
	
	@Override
	public int  saveCount() {
		  int count = 0;
		 String[] store = new String[TOTAL_COUNTRIES];
	        for (int index = 0; index < TOTAL_COUNTRIES; index++) {
	            if (names[index] != null) {
	            	store[count] = names[index];
	                count++;
	            }
	        }
	        System.out.println("Number of elements stored is : " + count);
	  return 0;
	}
}
