package JavaReferences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import JavaCollections.arrayList;

public class ArrayListMethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
//		Adding the values to the Array list
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
//	    Add All
	    ArrayList<String> brands = new ArrayList<String>();
	    brands.add("Microsoft");
	    brands.add("W3Schools");
	    brands.add("Apple");
	    cars.addAll(brands);
	    System.out.println(cars);
	    
//	    Clear
//	    cars.clear();
//	    System.out.println(cars);
	    
//	    Clone
	    ArrayList<String> newCars = (ArrayList<String>) brands.clone();
	    System.out.println(newCars);
	    
//	    Contains
	    System.out.println(newCars.contains("Nisha"));//False
	    System.out.println(newCars.contains("Apple"));

//	    The ensureCapacity() method increases the capacity of a list to a specified amount, if necessary
	    newCars.ensureCapacity(20);
	    
//	    For Each loop
	    newCars.forEach((n)->{
	    	System.out.println(n);
	    });
	    
//	    get Method
	    newCars.get(0);
	    
//	    Index method
	    newCars.indexOf("Apple");
	    
//	    Isempty
	   System.out.println(newCars.isEmpty());  
	   
//		Iterator
			Iterator<String> it = brands.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
			
//		Loop backwards through the list
			ListIterator<String> listIt = brands.listIterator();
			while (listIt.hasNext()) {
				System.out.println(listIt.next());
				}
			System.out.println("------");
			
			//Loop backwards
			while (listIt.hasPrevious()) {
				System.out.println(listIt.previous());
			}
			
//			Convert from ArrayList to Array
			Object[] carsArray = cars.toArray();
			for (Object i: carsArray) {
				System.out.println(i);
			}
	}
	


}
