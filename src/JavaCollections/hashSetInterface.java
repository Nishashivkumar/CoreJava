package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetInterface {

	public static void main(String[] args) {
//		Hashset, treeset and Linked Hashset implements Set Interface
		
		//Set doesn't accept duplicate values
		//There is no guarantee on elements stored in sequence, it will be in random order
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		
		System.out.println(hs.remove("UK"));
		System.out.println(hs.contains("INDIA"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		
		Iterator<String> i = hs.iterator();
//		System.out.println(i.next());
		//to check the data in the hash set which has more data
		while (i.hasNext()) {
			
			System.out.println(i.next());
		}
//		hs.clear();--To delete the entire HashSet
		System.out.println(hs);
		
//		Looping through a HashSet
		for (String j : hs) {
			System.out.println(j);
		}
		
//		Example - TO find the numbers which are from 1 to 10 in hashSet
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(10);		
		System.out.println(hs1);
		for (int k=1;k<= 10; k++) {
		     if( hs1.contains(k)){
		    	 System.out.println(k + " was found in the set");
		     }
		     else {
		    	 System.out.println(k + " was not found in the set"); 
		     }
			
		}

	}

}
