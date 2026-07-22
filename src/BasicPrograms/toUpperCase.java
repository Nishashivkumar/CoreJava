package BasicPrograms;

import java.util.Scanner;

public class toUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		upperLower();
		AsciiCaseConverter();
	}
	
	public static void toUpperCase() {
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		String updatedString = input.toUpperCase();
		System.out.println(updatedString);
		sc.close();
	}
	
	public static void upperLower() {
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		StringBuilder converted=new StringBuilder();
		for (int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				converted.append(Character.toLowerCase(ch));
			}
			else if (Character.isLowerCase(ch)) {
				converted.append(Character.toUpperCase(ch));
			}
			else {
				converted.append(ch);
			}
		}
		System.out.println(converted);
	}
	
	public static void AsciiCaseConverter () {
		String original = "Java Programming!";
		StringBuilder converted = new StringBuilder();
		for (int i=0;i<original.length();i++) {
			char ch = original.charAt(i);
			if(ch>='A' && ch<='Z') {
				converted.append((char) (ch+32));
			}
			
			else if (ch>='a' && ch<='z') {
				converted.append((char) (ch-32));
			}
			else {
				converted.append(ch);
			}
		}
		System.out.println(converted);
	}

}
