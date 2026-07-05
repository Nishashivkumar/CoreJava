package JavaReferences;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Tesla"};
		String[] cars2 = {"Volvo", "BMW", "Tesla"};
		String[] cars3 = {"Audi","Ferrari","Jaguar"};
		
//		The compare() method compares two arrays lexicographically.
		System.out.println(Arrays.compare(cars, cars2));
		System.out.println(Arrays.compare(cars, cars3));
		
//		The equals() method checks whether two arrays are equal.
		System.out.println(Arrays.equals(cars, cars2));
		System.out.println(Arrays.equals(cars, cars3));
		
//		The sort() method sorts an array in ascending order.
		Arrays.sort(cars,0,3);
		for(String i:cars) {
			System.out.println(i);
		}
		
//		The fill() method fills an array with a specified value.
		Arrays.fill(cars, "Audi");//Replaces all the values by Audi
		System.out.println(cars[0]);
		
		Arrays.fill(cars, 0,2,"Jaguar");//Fill the last two elements
		for(String i: cars) {
			System.out.println(i);
		}
		
//		Length of the array
		System.out.println(cars.length);
	}

}
