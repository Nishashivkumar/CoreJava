package BasicPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String given = sc.nextLine();//abc
		String reversedString = "";
		for (int i=given.length()-1;i>=0;i--) {
			reversedString =  reversedString + given.charAt(i);
			
		}
		
		System.out.println("After reverse" + " " + reversedString);

	}

}
