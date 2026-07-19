package BasicPrograms;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		reverseStringBuilder();
		reverseNum();
	}
	
	public static void reverseStringBuilder() {
		String str = "Selenium";
		StringBuilder strbuild = new StringBuilder(str);
		String reversedString= strbuild.reverse().toString();
		System.out.println(reversedString);
	}
	
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String given = sc.nextLine();//abc
		String reversedString = "";
		for (int i=given.length()-1;i>=0;i--) {
			reversedString =  reversedString + given.charAt(i);
			
		}
		
		System.out.println("After reverse" + " " + reversedString);
	}
	
	public static void reverseNum() {
		int num=12345;
		int reverseNum=0;
		 while(num!=0) {
			 reverseNum =reverseNum*10 + num%10;//5, 50+4=54, 540+3=543, 5430+2=5432, 54320+1=54321
			 num=num/10;//1234, 123, 12, 1, 0
		 }
		 System.out.println(reverseNum);
	}

}
