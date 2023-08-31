package com.xworkz.util;

public class ValidUtil {

	public static boolean validString(String string)
	{
		if(string!=null&&!string.isEmpty()&&string.length()>3&&string.length()<30)
		{
			System.out.println("The String is valid:"+string);
			return true;
		}
		
		
			System.out.println("The String is not valid:"+string);
			return false;
		
	}

	public static boolean validInt(int num)
	{
		if(num>0&&num<10000)
		{
			System.out.println("The num is valid:"+num);
			return true;
		}
		System.out.println("The num is not valid:"+num);
		return false;
	}
}
