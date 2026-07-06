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

}
