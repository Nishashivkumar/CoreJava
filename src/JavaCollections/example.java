package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class example {

	public static void main(String[] args) {
		//Printing Unique Number and how many times its present in the array 
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
			int k=0;
			//Printing unique values
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				//Counting the numbers
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " present " + k + " times");
			}
			
			
		}
		System.out.println("Array Unique values" + al);
		

	}

}
