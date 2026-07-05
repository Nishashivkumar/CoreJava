package JavaClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx {

	public static void main(String[] args) {
		//A regular expression is a sequence of characters that forms a search pattern. 
		//When you search for data in a text, you can use this search pattern to describe what you are searching for.
		
//		The first parameter of the Pattern.compile() method is the pattern. It describes what is being searched for.
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		
/*		The matcher() method is used to search for the pattern in a string. 
        It returns a Matcher object which contains information about the search that was performed */
		Matcher matcher = pattern.matcher("Visit W3schools!");
		boolean matchFound= matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}
	}

}
