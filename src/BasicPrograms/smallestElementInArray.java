package BasicPrograms;

public class smallestElementInArray {

	public static void main(String[] args) {
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		int i=ages[0];
		
		for(int j=0;j<ages.length;j++) {
			if(ages[j] < i ) {
				i=ages[j];
				System.out.println(i);
			}
			}
		System.out.println(i + " is the smallest number");

	}

}
