package Practice;

import java.util.ArrayList;
import java.util.Iterator;

import JavaCollections.arrayList;

public class arrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayPrograms ap=new arrayPrograms();
		ap.MaxMinNum();
		ap.removeDuplicates();
		ap.arrayList();
		ap.secondLargest();
	}
	
	public void MaxMinNum() {
		int array[]= {5,10,15,20};
		int num=array[1];
		//to find minimum number
		for (int i=0;i<=array.length-1;i++) {
			if (num>array[i]) {
				num=array[i];
			}
		
					
		}
		System.out.println(num + "is the smallest number");
		
		for (int j=0;j<=array.length-1;j++) {
			if (num<array[j]) {
				num=array[j];
			}
			
		}
		System.out.println(num + "is the largst number");
	}
	
	public void removeDuplicates() {
		int array[]= {1,1,2,3,4,4,5,5};
		ArrayList<Integer> AL = new ArrayList<Integer>();
		for (int i=0; i<=array.length-1; i++) {
			if(!AL.contains(array[i])) {
				AL.add(array[i]);
			}
		}
		System.out.println("Unique number list are " + AL);
		
	}
	
//	Write a Java program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
	public void arrayList() {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		
		Iterator<Integer> itr = AL.iterator();
		//while loop
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//enhanced for loop
		for (int i:AL) {
			System.out.println(i);
		}
		
//		for loop
		for(int i=0;i<=AL.size()-1;i++) {
			System.out.println(AL.get(i));
		}
	}
	
//	Write a Java Program to find the second-highest number in an array.
	public void secondLargest() {
		int Array[]= {14,100, 46, 47, 94, 94, 52, 86, 36, 94, 89};
		int largest=0;
		int secLargest=0;
		for (int i=0; i<=Array.length-1;i++) {
			if(Array[i]>largest) {
				secLargest=largest;//0, 14
				largest=Array[i];//14, 100
			
			}
			else if(Array[i]>secLargest){
				secLargest=Array[i];
			}
		}
		System.out.println("Largest Number is " + largest);
		System.out.println("Second Largest Number is " + secLargest);
	}
	

}
