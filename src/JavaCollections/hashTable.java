package JavaCollections;

import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		//Difference between HashMap and HashTable - 
//		1.HashMap is non synchronized and not thread safe and HashTable is synchronized and thread safe
//		2.HashMap allows null values where as HashTable doesn't
//		3.HashMap values are iterated using Iterator, Hash Table is only class other than vector which uses 
//		enumerator to iterate the values of HashTable object
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "hello");
		ht.put(2, "Hi");

	}

}
