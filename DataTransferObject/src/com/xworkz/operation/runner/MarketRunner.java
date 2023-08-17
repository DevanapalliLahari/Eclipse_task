package com.xworkz.operation.runner;

import com.xworkz.operation.DTO.MarketDTO;
import com.xworkz.operation.implementation.MarketRepositoryImpl;
import com.xworkz.operation.repository.MarketRepository;

public class MarketRunner {

	public static void main(String[] args) {
System.out.println("Running main");
MarketDTO market=new MarketDTO("RK MARKET","Anatapur","Super Market", 250, 300);
System.out.println(market.toString());
System.out.println();

MarketDTO market1=new MarketDTO("The Urban Farmers Market","Araku","vegtable market", 120,150);
System.out.println(market1.toString());
System.out.println();

MarketDTO market2=new MarketDTO("pure Form","Ooty","Form market",150,200);
System.out.println(market2.toString());
System.out.println();

MarketDTO market3=new MarketDTO("The Glories Mart","Bangloore","Super Mart", 300,400);
System.out.println(market3.toString());
System.out.println();

MarketDTO market4=new MarketDTO("Sweet Farms","Chennai"," Market", 160, 200);
System.out.println(market4.toString());
System.out.println();

MarketRepository repository=new MarketRepositoryImpl();
repository.save(market);
System.out.println();

MarketRepository repository1=new MarketRepositoryImpl();
repository1.save(market1);
System.out.println();

MarketRepository repository2=new MarketRepositoryImpl();
repository2.save(market2);
System.out.println();

MarketRepository repository3=new MarketRepositoryImpl();
repository3.save(market3);
System.out.println();

MarketRepository repository4=new MarketRepositoryImpl();
repository4.save(market4);
System.out.println();


	}

}
