package BasicPrograms;

import java.util.ArrayList;

import JavaCollections.arrayList;

public class commonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1= {0,1,2,4,6};
		int [] array2= {0,1,2,6,7,8};
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				if (array1[i]==array2[j]) {
					arrayList.add(array1[j]);//or arrayList.add(array1[i])
				}
			}
		}
		
		System.out.println(arrayList);
	}

}
