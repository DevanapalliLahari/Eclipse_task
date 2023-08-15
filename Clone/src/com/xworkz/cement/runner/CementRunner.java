package com.xworkz.cement.runner;

import com.xworkz.cement.app.Cement;

public class CementRunner {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Running main");
		Cement cement = new Cement();
		cement.setBrand("Nagarguna Cement");
		cement.setAmbassador("Varun Tej");
		cement.setPrice(150);
		cement.setWeight(50);
		System.out.println(cement.getBrand());
		System.out.println(cement.getAmbassador());
		System.out.println(cement.getPrice());
		System.out.println(cement.getWeight());
        System.out.println();
        
		Cement cement1 = (Cement) cement.clone();
		cement1.setBrand("Ramco");
		cement1.setAmbassador("Murthy");
		cement1.setPrice(160);
		cement1.setWeight(49);
		System.out.println(cement1.getBrand());
		System.out.println(cement1.getAmbassador());
		System.out.println(cement1.getPrice());
		System.out.println(cement1.getWeight());
		System.out.println();

		Cement cement2 = (Cement) cement.clone();
		cement2.setBrand("Altra tech");
		cement2.setAmbassador("Nagarjuna");
		cement2.setPrice(200);
		cement2.setWeight(45);
		System.out.println(cement2.getBrand());
		System.out.println(cement2.getAmbassador());
		System.out.println(cement2.getPrice());
		System.out.println(cement2.getWeight());
		System.out.println();

		Cement cement3 = (Cement) cement.clone();
		cement3.setBrand("Ambuja");
		cement3.setAmbassador("Kohli");
		cement3.setPrice(180);
		cement3.setWeight(49);
		System.out.println(cement3.getBrand());
		System.out.println(cement3.getAmbassador());
		System.out.println(cement3.getPrice());
		System.out.println(cement3.getWeight());
		System.out.println();

		Cement cement4 = (Cement) cement.clone();
		cement4.setBrand("penna cement");
		cement4.setAmbassador("Adrash");
		cement4.setPrice(140);
		cement4.setWeight(50);
		System.out.println(cement4.getBrand());
		System.out.println(cement4.getAmbassador());
		System.out.println(cement4.getPrice());
		System.out.println(cement4.getWeight());
		System.out.println();

		Cement cement5 = (Cement) cement.clone();
		cement5.setBrand("Bharathi");
		cement5.setAmbassador("Ramya");
		cement5.setPrice(180);
		cement5.setWeight(49);
		System.out.println(cement5.getBrand());
		System.out.println(cement5.getAmbassador());
		System.out.println(cement5.getPrice());
		System.out.println(cement5.getWeight());
		System.out.println();

		Cement cement6 = (Cement) cement.clone();
		cement6.setBrand("Dalmia");
		cement6.setAmbassador("Dhoni");
		cement6.setPrice(170);
		cement6.setWeight(50);
		System.out.println(cement6.getBrand());
		System.out.println(cement6.getAmbassador());
		System.out.println(cement6.getPrice());
		System.out.println(cement6.getWeight());
		System.out.println();

		Cement cement7 = (Cement) cement.clone();
		cement7.setBrand("Acc Cement");
		cement7.setAmbassador("Sahin");
		cement7.setPrice(370);
		cement7.setWeight(50);
		System.out.println(cement7.getBrand());
		System.out.println(cement7.getAmbassador());
		System.out.println(cement7.getPrice());
		System.out.println(cement7.getWeight());
		System.out.println();

		Cement cement8 = (Cement) cement.clone();
		cement8.setBrand("Birla");
		cement8.setAmbassador("Adithya Birla");
		cement8.setPrice(275);
		cement8.setWeight(50);
		System.out.println(cement8.getBrand());
		System.out.println(cement8.getAmbassador());
		System.out.println(cement8.getPrice());
		System.out.println(cement8.getWeight());
		System.out.println();

		Cement cement9 = (Cement) cement.clone();
		cement9.setBrand("India Cement");
		cement9.setAmbassador("Varun Tej");
		cement9.setPrice(150);
		cement9.setWeight(50);
		System.out.println(cement9.getBrand());
		System.out.println(cement9.getAmbassador());
		System.out.println(cement9.getPrice());
		System.out.println(cement9.getWeight());
		System.out.println();

		
	}

}
