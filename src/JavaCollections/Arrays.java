package JavaCollections;

public class Arrays {

	public static void main(String[] args) {
//		Initializing array with the size
//		Arrays = A container that stores multiple values with same data type
		int a[] = new int[6];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		a[5]=12;
		
//		Looping over the array
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);;
			
		}
		
		Arrays b = new Arrays();
		b.lowestAge();
	}
	
//	finds the lowest age among different ages:
	public void lowestAge() {
		// An array storing different ages
		int ages[] = {40, 22, 18, 35, 48, 26, 87, 70};
		int k =ages[0];
		for(int i=0;i<ages.length;i++) {
			//k=40
			if(k>ages[i]) { //40>22
				k=ages[i];//k=22
				
			}
			
					}
		System.out.println(k + " is the smallest age");
	}
	

}
