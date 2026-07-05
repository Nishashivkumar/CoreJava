package conditions;

import java.util.ArrayList;

import JavaCollections.arrayList;

public class ForEachLoop {

	public static void main(String[] args) {
//		"for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
			System.out.println(i);
		}
		
		ArrayList<Integer> carList = new ArrayList<Integer>();
		carList.add(1);
		carList.add(2);
		carList.add(3);
		for (Integer i : carList) {
			System.out.println(i);
		}

	}

}
