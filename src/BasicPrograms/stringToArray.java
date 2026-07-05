package BasicPrograms;

import java.util.Arrays;

public class stringToArray {

	public static void main(String[] args) {
		String myArray = "Hello";
		
/////FIRST METHOD
//		String to array
		String[] arrayString = myArray.split("");
//		Print an array		
		for(String i: arrayString) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(arrayString));
		
/////SECOND METHOD
		char[] arrayString1= myArray.toCharArray();
		System.out.println(arrayString1[0]);

	}

}
