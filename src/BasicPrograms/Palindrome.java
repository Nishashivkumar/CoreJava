package BasicPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {

/*A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
 * It can also be a string like LOL, MADAM etc.
 */
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	Palindrome pm = new Palindrome();
	pm.findPalindrome();

	}

	public void findPalindrome() {
		System.out.println("Enter the number");
		String original=  sc.next();//525
		String reverse = "";
		for(int i=original.length(); i>0;i--) {
//			System.out.println(i);
			 reverse = reverse + original.charAt(i);
//			System.out.println(reverse);
			}
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(original + " is a palindrome");
		}
		
		else {
			System.out.println(original + " is not a palindrome");
		}
		
	}
}


