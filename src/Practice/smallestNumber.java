package Practice;

public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,1,3,4,5};
		int first=num[1];//1
		int small=0;
		for(int i=0;i<=num.length-1;i++){
			if (first<num[i]) {
				small=first;
			}
			else small=num[i];
		}
		System.out.println(small + " is the smallest number");
		

	}
	
	public void secondLargest() {
		int[] Array = {10,2,6,7,8,5,11};
		int largest=0;
		int secLargest=0;
		
		for (int i=0;i<=Array.length-1;i++) {
			if (Array[i]>largest) {
				secLargest=largest;//10, 
				largest=Array[i];//11
				}
			else if (Array[i]>secLargest) {
				secLargest=Array[i];//2, 6, 7, 8
			}
			
		}
	}

}
