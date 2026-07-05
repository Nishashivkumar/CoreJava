package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkedList {

//	The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. 
//  This means that you can add items, change items, remove items and clear the list in the same way.
//Difference - ArrayList is better for storing and accessing data where as LinkedList is better for manipulating data.	
	public static void main(String[] args) {
		
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("N");
		li.add("I");
		li.add("S");
		li.add("H");
		li.add("A");
		
//		Sorting using Collections package -->same for both linkedList and arrayList
		Collections.sort(li);
		System.out.println(li);
		
//Reverse the order		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(2);
		ar.add(10);
		ar.add(20);
		ar.add(1);
		System.out.println("Before" + ar);
		Collections.reverse(ar);
		System.out.println("After" + ar);
	}

}
