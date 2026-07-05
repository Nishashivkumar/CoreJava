package JavaReferences;

public class stringMethods {

	public static void main(String[] args) {
		String name = "Nisharani";
		
		System.out.println(name.charAt(0)); //Returns the character at the specified index (position)
		System.out.println(name.codePointAt(0)); //Returns the Unicode of the character at the specified index
		System.out.println(name.compareTo("Nisha")); //Compares two strings lexicographically
		System.out.println(name.compareToIgnoreCase("NISHARANI"));//Compares two strings lexicographically, ignoring case differences
		System.out.println(name.concat("a")); //Appends a string to the end of another string
		System.out.println(name.contains("sh"));//Checks whether a string contains a sequence of characters
		System.out.println(name.contentEquals("Nisha"));//Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
		char[] name2= {'H','E','L','L','O'};
		System.out.println(String.copyValueOf(name2, 0, 1));//Returns a String that represents the characters of the character array
		System.out.println(name.endsWith("n"));//Checks whether a string ends with the specified character(s)
		System.out.println(name.equals(name2));//Compares two strings. Returns true if the strings are equal, and false if not
		System.out.println(String.format(name, "rani"));
		
		System.out.println(name.hashCode());//Returns the hash code of a string
		System.out.println(name.indexOf(1));//Returns the position of the first found occurrence of specified characters in a string
		System.out.println(name.isEmpty());//Checks whether a string is empty or not
		System.out.println(String.join(" ", "S","Nisha"));//Joins one or more strings with a specified separator
		
	}

}
