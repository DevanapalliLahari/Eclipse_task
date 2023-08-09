package com.xworkz.printing.runner;

import com.xworkz.printing.app.SmartWatch;
import com.xworkz.printing.implement.AppleSmartWatch;
import com.xworkz.printing.user.SharukKhan;

public class SmartWatchRunner {
public static void main(String[]args) {
	System.out.println("Running main");
	SmartWatch watch=new AppleSmartWatch();
	System.out.println(SmartWatch.COST);
	watch.time();
	
	SharukKhan khan=new SharukKhan(watch);
	khan.showTime();
}
}
