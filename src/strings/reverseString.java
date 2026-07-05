package strings;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String ReversedString ="";
		for (int i=name.length();i>0;i--) {
			ReversedString= ReversedString + name.charAt(i-1);	
		}
		
		//To check whether the string is palindrome
		if (ReversedString == name) {
			System.out.println("Given string is a palindrome");
		}
		
		else {
			System.out.println("Given string is not a palindrome");
		}
		
		

	}

}
