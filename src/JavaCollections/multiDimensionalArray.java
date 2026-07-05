package JavaCollections;

public class multiDimensionalArray {

	public static void main(String[] args) {
		
//		Defining an empty array and adding values
		int a[] [] = new int [2][2];
		a[0][0]=2;
		a[0][1]=3;
		a[1][0]=4;
		a[1][1]=5;

//		Defining multidimensional array --> 2*2 Array
		 int b[][] = {{1,2},{3,4}};
		 
//		 3*3 Array
		 int c[][]= {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println(a[0][0]);
//		 Looping
		for (int i = 0;i<2; i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
			
		}
		
//		without hard coding
		for (int i = 0;i<a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
			
		}
		

		multiDimensionalArray md = new multiDimensionalArray();
		//md.minNum();//		Calling minNum method
		//md.maxNum();//		Calling maxNum method
		md.minMaxNum();
	}
	
	
//	To print minimum number from the matrix
	public void minNum() {
		int a [][] = {{2,5,3},{4,5,6},{7,0,9}};
		
		int k= a[0][0];//1
//		System.out.println("length " + a.length);
		
		for(int i=0;i<a.length;i++) { //Outer for loop -->to traverse in the row
//			System.out.println("length of a[i]" + a[i].length);
			for (int j=0;j<a[i].length;j++) { //Inner for loop --> to traverse in the columns
				if (k>a[i][j]) { 
					k=a[i][j];
				}
				
			}
		}
		System.out.println(k + " is the smallest number in the matrix");
		
	}
	
//	To print maximum number from the matrix
	public void maxNum() {
		int a [][] = {{2,5,3},{4,5,6},{7,0,9}};
		int max = a[0][0];
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max + " is the largest number in the matrix");
	}
	
//	Cisco Interview Question --> Find the min num first and in that column find the max num
	public void minMaxNum() {
		int a [][] = {{2,11,3}, 
					  {4,10,6},
					  {1,0,9}};
		
		int k= a[0][0];//1
		int min = 0;
		for(int i=0;i<a.length;i++) { 

			for (int j=0;j<a[i].length;j++) { 
				if (k>a[i][j]) { 
					k=a[i][j];
					 min=k;
//					System.out.println("Index of i " + i);//i is row number
//					System.out.println("Index of j " + j);//j is column number
					
					for(int m=0;m<a[i].length;m++) {
						if (min < a[m][j]) {
							min= a[m][j];
						}
					}	
				}				
			}
		}
		System.out.println(k + " is the smallest number in the matrix");
		System.out.println(min + " is the largest");
		}

}
