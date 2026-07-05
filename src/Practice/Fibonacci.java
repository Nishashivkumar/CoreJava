package Practice;

import java.util.Iterator;

public class Fibonacci {
	
	int a=0, b=1, c;
	
	public static void main(String[] args) {
		/*Fibonacci Number --> In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
		The first two numbers of fibonacci series are 0 and 1. */
		Fibonacci fib = new Fibonacci();
		fib.fibonacci();
		
	}
	public void fibonacci() {
		
		for (int i = 0; i<100;i++) {
			
			c=a+b;//0+1,
			System.out.println(a + b + c);
			a=b;
			b=c;
			i++;
			
		}
		
	}
}
