package BasicPrograms;

import java.util.Scanner;

public class addTwoNum {
	
	
	public static void main(String[] args) {
		
		sum();
	}
	
	public static int sum() {	
		int x,  y,  sum;
		System.out.println("Enter the value of x " );
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("Enter the value of y ");
		y= sc.nextInt();
		sum=x+y;
		System.out.println("Sum of the two numbers " + sum); 
		return sum;
		}
	
	

}
