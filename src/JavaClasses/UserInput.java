package JavaClasses;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the user");
		String name = sc.nextLine();
		System.out.println("The name of the user is " + name);
	}

}
