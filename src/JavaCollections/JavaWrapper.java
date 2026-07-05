package JavaCollections;

import java.util.ArrayList;

public class JavaWrapper {

	public static void main(String[] args) {

//WRAPPER CLASSES	
//		Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//		Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
//		ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

		
//WRAPPER OBJECTS
		Integer myInt = 100;
		Double myDouble=10.5;
		Character mychar ='N';
		
//Methods used on Wrapper Objects to get information about the specific object.
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(mychar.charValue());
		
//		To convert an Integer to a String, and use the length() method of the String class to output the length of the "string":
		
	    String myString = myInt.toString();
	    System.out.println(myString);
	    System.out.println(myString.length());
	}

}
