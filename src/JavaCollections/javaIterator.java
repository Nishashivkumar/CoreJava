package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class javaIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(20);
		Iterator<Integer> it = array.iterator();
		
		while (it.hasNext()) {
			int i= it.next();
			System.out.println(i);
			if(i>10) {
				it.remove();
			}
			System.out.println(array);
		}
	}

}
