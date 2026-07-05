package BasicPrograms;

import java.util.Iterator;

/*Fibonacci Number --> In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
The first two numbers of fibonacci series are 0 and 1. */
public class FibonacciNumber {
	
	int a=0,b=1,c;
	
	public static void main(String[] args) {
		
		FibonacciNumber fn = new FibonacciNumber();
		fn.findNum();

	}
		public void findNum() {
		for (int i=0; i<=50; i++) {
			this.c = this.a+this.b;
			this.a=b;
			this.b=c;
			System.out.println(c);
			i++;		
		}
	}

}
