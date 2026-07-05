package strings;

public class strings {

	public static void main(String[] args) {
		
		//String - it is one of the prebuilt class in java
		//two ways of defining strings - 1.String literals 2.Creating object of a string 
		
		String a = " Nisha ";//String literal
		String ab = new String("Nisha");//with string class
		System.out.println(a.charAt(2));//print third character in a 
		System.out.println(a.indexOf("N"));
		System.out.println(a.substring(1,3));
		System.out.println(a.substring(0));
		System.out.println(a.concat("r ani "));
		System.out.println(a.trim());
		
		//splitting a string
		String abc = "Java/training";
		String splittedString[] = abc.split("/");
		System.out.println(splittedString[1]);
		
		//Replace 
		System.out.println(a.replace("a", "s"));

	}

}
