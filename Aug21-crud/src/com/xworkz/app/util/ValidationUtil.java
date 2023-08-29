package com.xworkz.app.util;

public class ValidationUtil {

	public static boolean validateString(String string)
	{
		if(string!=null&& !string.isEmpty()&& string.length()>=3&& string.length()<30)
		{
			return true;
		}
		System.err.println(string + " is Invalid,validation util...");
		return false;
		
	}
	public static boolean validateInt(int integer)
	{
		if(integer>0&& integer<100000)
		{
			return true;
		}
		System.err.println(integer + "is Invalid,Validation Util...");
		return false;
		
	}

}
