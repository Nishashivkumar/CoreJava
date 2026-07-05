package Practice;

import java.util.Scanner;

public class palindrome {
	/*A palindrome number is a number that is same after reverse. 
	 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	 * It can also be a string like LOL, MADAM etc.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome pal = new palindrome();
		pal.findPalidrome();
		

	}
	
	public void findPalidrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String num = sc.next();//aba
		String reverse="";
		for (int i=num.length()-1;i>=0;i--) {
			reverse = reverse + num.charAt(i);
		}
		
		if (reverse.equalsIgnoreCase(num)) {
			System.out.println(num + "is palindrome");
		}
		
		else {
			System.out.println(num + "is not palindrome");
		}
	}

}
