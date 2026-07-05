package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		//Array list has dynamic size, we can increase by adding or decrease by removing, whereas Array has fixed size
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Nisha");
		a.add("Java");
		a.add("array");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		
		//Change an Item
		a.set(0, "Nisha");
		
		//Testing 
		System.out.println(a.get(0));
		System.out.println(a.size());
		System.out.println(a.contains("Java"));
		System.out.println(a.get(1));
		System.out.println(a.set(1, "Rani"));
		System.out.println(a);
		
		//Array List Manipulation
		ArrayList<String> array = new ArrayList<String> ();
	    array.add("apple");
	    array.add("banana");
	    array.add("cherry");
	    array.add("mango");
	    array.add("apple");
	    array.add("apple");
	    System.out.println(array);
	    
	    //Element Removal
	    array.remove("apple");
	    System.out.println(array);
	    
	    //Element Search
	    System.out.println(array.contains("orange"));
	    
	    //Size and content check
	    System.out.println(array.size());

//	    Looping over ArrayList
	    for (int i = 0; i<=array.size() - 1; i++) {
			System.out.println("Index :" + i + " " + "Value :" + array.get(i));
			
		}
	    //testing 
	    System.out.println(a.contains("Java"));
	    System.out.println(a.indexOf("array"));
	    System.out.println(a.isEmpty());
	    System.out.println(a.size());
	    
//	    System.out.println("Print a" + a);
	    Collections.sort(array);
	    System.out.println("Print sort" + array);
	    for (String j : array) {
	    	System.out.println(j);
	    }
	    
	    
//	    Array List can accept duplicate values and push it to separate index
//	    Difference between Array and Array List --> Array has fixed size and Array List is dynamic, you can access and insert any values at any index
	}

}
