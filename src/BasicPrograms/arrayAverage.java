package BasicPrograms;

public class arrayAverage {

	public static void main(String[] args) {
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		float sum = 0,avg=0;
		System.out.println(ages.length);
		for (int i=0;i<ages.length;i++) {
			sum=sum+ages[i];
			System.out.println(sum);
			
		}
		
		avg=sum/ages.length;
		System.out.println("Average is " + avg);

	}

}
