package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapInterface {

	public static void main(String[] args) {
		//In Hash Map, data will be in Key : Value pair
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "hello");
		hm.put(2, "good");
		hm.put(3, "morning");
		hm.put(4, "evening");
		
		System.out.println(hm);
		
		System.out.println(hm.get(1));//TO get the Value of the Key
		System.out.println(hm.size());
		
		//Iteration 
		Set sn = hm.entrySet(); //first convert from hashmap to set for iteration
		
		Iterator it = sn.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			//Implementation of Interface - to extract key and value separately, cast map.entry to the set
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			System.out.println(mp.getClass());
		}
		
//		Looping over hashmap
		//To get the Key in HashMap
		for(int i: hm.keySet()) {
			System.out.println(i);
		}
		
		//To get the Value in HashMap
		for(String j: hm.values()) {
			System.out.println(j);
		}
		
		//To get both Key and Values 
		for(int k:hm.keySet()) {
			System.out.println("Key : " + k + "," + " Value : " + hm.get(k));
		}

	}

}
