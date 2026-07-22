package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import JavaCollections.arrayList;

public class interview {

	public static void main(String[] args) {
		
		interview inter = new interview();
//		inter.indice();
//		inter.printing();
		inter.printThirdLargest();
	}
	
//	To print the indices of two array elements whose sum is equal to the target number
	public void indice() {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int array[]= {5,12,7,10,8,9};
		for(int i=0;i<array.length;i++) {
			for (int j=i+1; j<array.length;j++) {
				if(array[i] + array[j] == num) {
					System.out.println(array[i] + "and " + array[j] + "are equal to sum " + num + " their indexes are " + i + " and " + j );
				}
			}
			
		}
	}
	
//	Print the third largest number from the given input: "abc102675rts"
	public void printThirdLargest() {
		String str ="abc102675rts";
		ArrayList<Integer> ArrayList= new ArrayList<Integer>();
		for (char ch: str.toCharArray()) {
			if(Character.isDigit(ch)) {
				ArrayList.add(ch - '0');
//				System.out.println(ArrayList);
			}
		}
		if(ArrayList.size()<3) {
			System.out.println("Third largest number is not found");
		}
		else {
			Collections.sort(ArrayList);//ascending order
			System.out.println(ArrayList);
			Collections.sort(ArrayList, Collections.reverseOrder());
			System.out.println(ArrayList);
			System.out.println(ArrayList.indexOf(2));
		}
		
	}
	
	public void printing() {
		System.out.println("Welcome" + 1 + 2 +3);
	}

}
