package conditions;

import java.util.Iterator;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested loops
//		for (int i = 0; i<5; i++) {
//			System.out.println(i);
//			for(int j=0;j<5;j++) {				
//				System.out.println(j);						
//			}
//						
//		}
		
		//printing pyramid triangle
		int k=1;
		for (int i=1; i<=5; i++) { 
			
			for(int j =1; j<=6-i;j++) {
				System.out.print( k);
				System.out.print("\t");
				k+=1;
			
		}
			System.out.println("");

	} 
		
		//printing reverse pyramid triangle
		int m=1;
		for (int i=5; i>=1; i--) { 
			
			for(int j=1; j<=6-i; j++)  
			{
				System.out.print(m);
				System.out.print("\t");
				m++;
			}
			System.out.println("");
			
		}
		
		//printing multiples of 3
		int n=3;
		for (int i=1;i<=5;i++) { //1;1<=5;2
			for (int j=1;j<=6-i;j++) //2;2<=5;3
			{ 
				System.out.print(n);//3,6,
				System.out.print("\t");
				n=n+3;//6,
				}
			
			System.out.println("");
		} 

}
}
