package com.xworkz.app.util;

public class ValidUtil {

	public static boolean validateString(String string) {
		if (string != null && !string.isEmpty() && string.length() >= 3 && string.length() < 30) {
			return true;
		}
		System.err.println(string + " is Invalid,validation util...");
		return false;

	}
}
