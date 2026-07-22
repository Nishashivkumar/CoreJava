package BasicPrograms;

import java.io.InputStream;
import java.util.Scanner;

/*Prime number is a number that is greater than 1 and divided by 1 or itself only. 
In other words, prime numbers can't be divided by other numbers than itself or 1. 
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers. */
public class PrimeNumber {
	
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (isPrime(num)) {
			System.out.println(num + " is a prime");
		}
		
		else {
			System.out.println(num + " is not a prime");
		}

	}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for (int i=2; i*i<=num; i++) {
			if(num % i ==0 ){
				return false;
			}
			}
		return true;
	}
}
