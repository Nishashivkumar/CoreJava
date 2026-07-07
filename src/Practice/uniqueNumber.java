package Practice;

import java.util.ArrayList;

import JavaCollections.arrayList;

public class uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,1,2,3,4,2,3,4,5,6,7,8};
		ArrayList<Integer> uniqueNum = new ArrayList<Integer>();
		for (int i=0;i<=num.length-1;i++) {
			if (!uniqueNum.contains(num[i])) {
				uniqueNum.add(num[i]);
				
			}
		}
		System.out.println(uniqueNum);
	}

}
