package com.xworkz.country.app;

public interface CountryRepository {
	int TOTAL_COUNTRIES = 10;
	

	void save(String name);

	default void display() {
		System.out.println("Invoking countries");
	}
	default boolean isExit(String name)
	{
		System.out.println("Checking the countries is exit or not");
		return false;
	}
	default String findReturnUpperCase(String name)
	{
		System.out.println("finding upper case String");
		return null;	
	}
   default String[] findStartsWith(String name)
   {
	   System.out.println("Finding the Starts with ");
	return null;
	   
   }
   default String[] findEndsWith(String name)
   {
	   System.out.println("Finding the name which  ends with char ");
	return null;
	   
   }
   default String[] findMatching(String name)
   {
	   System.out.println("find the matching names");
	   return null;
	   
   }
    default void orderDesc()
    {
    	System.out.println("desc order of String names");
    	
    }
    default String[]  orderAsc()
    {
    	System.out.println("asc order of String names");
		return null;
    }
    default int saveCount()
    {
    	System.out.println(" saving the count of the names");
		return 0;
    	
    }


}

