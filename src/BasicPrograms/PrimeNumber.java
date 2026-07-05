package BasicPrograms;

import java.io.InputStream;
import java.util.Scanner;

/*Prime number is a number that is greater than 1 and divided by 1 or itself only. 
In other words, prime numbers can't be divided by other numbers than itself or 1. 
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers. */
public class PrimeNumber {
	
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrimeNumber PN = new PrimeNumber();
		PN.FindPrimeNumber();

	}
	
	public void FindPrimeNumber() {
		System.out.println("Enter the Number");
		int SysNum= sc.nextInt();
		
		if (SysNum % 2 == 0 & SysNum <=0) {
			System.out.println( SysNum + " is not a prime number");
		}
		
		else {
			System.out.println( SysNum + " is a prime number");
		}
		
		
	}

}
