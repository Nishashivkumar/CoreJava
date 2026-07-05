package Practice;

public class highestNumber {

	public static void main(String[] args) {
		// Question 3: Find the Second Highest Number in an Array
		int Array[]= {0,1,2,3,4};
		int highest=Array[0];//0
		int[] secondHighest;
		for (int i=Array.length;i>=0;i++) {
			if (highest > Array[i]) {
				highest=Array[i];
				i++;
			}
			
			System.out.println(highest);
		}

	}

}
