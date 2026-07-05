package BasicPrograms;

import java.util.Arrays;

public class sumOfArray {

	public static void main(String[] args) {
		sumOfArray sum = new sumOfArray();
		sum.mergeTwoArrays();
	}
	
	public void sumOfArray() {
		int[] myArray = {2,3,4,5,6};
		int sum = 0;
		int i;
		
		for(i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];
		}
		
		System.out.println(sum);
	}
	public void mergeTwoArrays() {
		int[] a = {1,2,3,4};
		int[] b= {1,2,3};
		
		//get the length of the array
		int a1=a.length;
		int b1=b.length;
		int arraySize = a1+b1;
		
		//resultant array
		int resultantArray []= new int [arraySize] ;
//		src the source array, srcPos- starting position in the source array,dest- the destination array,destPos- starting position in the destination data,length- the number of array elements to be copied.
		System.arraycopy(a, 0, resultantArray, 0, a1);
		System.out.println(Arrays.toString(resultantArray));
		System.arraycopy(b, 0, resultantArray, a1, b1);
		System.out.println(Arrays.toString(resultantArray));
		
	}

}
