package Practice;

import java.util.ArrayList;

import JavaCollections.arrayList;

class commonElement {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5,7};
		 int array2[]= {1,2,3,4,7,8};
		 ArrayList<Integer> array3= new ArrayList<Integer>();
		 
		 for(int i=0;i<=array1.length-1;i++) {
			 for(int j=0;j<=array2.length-1;j++) {
				 if(array1[i]==array2[j]) {
					 
					 array3.add(array1[i]);
					 
				 }
			 }
		 }
		 System.out.println(array3);
	 }

	}


