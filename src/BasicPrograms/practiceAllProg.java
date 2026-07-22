package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import JavaCollections.arrayList;

public class practiceAllProg {

	public static void main(String[] args) {
//		addTwoNum();
/*		if (anagram()) {
			System.out.println("Given words are anagram");
		};*/
		
//		arrayAvg();
//		commonElement();
//		countWords();
//		fibonacci();
//		palindrome();
		if( primeNum()) {
			System.out.println("Prime");
		}
		else System.out.println("Not a prime");;

	}
	
	public static void addTwoNum() {
		int i=2; int j=3;
		int sum=i+j;
		System.out.println("Sum of two numbers are " + sum);
	}
	
	public static boolean anagram() {
		String string1="Silent";
		String string2="Listen";
		
		char[] string1Array= string1.toCharArray();
		char[] string2Array= string2.toCharArray();
		Arrays.sort(string2Array);
		Arrays.sort(string2Array);
		
		for(char s: string1Array) {
			System.out.println(s);
		}
		if(Arrays.equals(string1Array, string2Array)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void arrayAvg() {
		int[] Array = {1,2,3,4,5};
		int sum=0; int avg=0;
		for(int i=0; i<Array.length;i++) {
			sum = sum + Array[i];			
		}
		avg = sum/Array.length;
		System.out.println(avg);
	}
	
	public static void commonElement() {
		int[] Array1= {1,2,3,8,9};
		int[] Array2= {1,2,3,4,5};
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		for (int i=0;i<Array1.length;i++) {
			for(int j=0;j<Array2.length;j++) {
				if(Array1[i]==Array2[j]) {
					arrayList.add(Array1[i]);
				}
			}
		for(int k: arrayList) {
			System.out.println(k);
		}
		}
	}
	
	public static void countWords() {
		String word="One Two Three";
		String array[]= word.split("");
		int count =array.length;
		System.out.println(count);
	}
	
	public static void fibonacci() {
		//0,1,1,2,3,5
		int a=0, b=1, c;
		for(int i=0;i<50;i++) {
			c=a+b;//0+1=1, 1+1=2, 
			a=b;//a=1, 1
			b=c;//b=1, 2
			System.out.println(c);
			}
	}
	
	public static void palindrome() {
		String num="12321";
		String reverse = "";
		for(int i=num.length()-1;i>=0;i--) {
			reverse = reverse + num.charAt(i);
		}
		if(reverse.equalsIgnoreCase(num)) {
			System.out.println(num + " is palindrome");
		}
		else {
			System.out.println(num + " is not palindrome");
		}
	}
	
	public static boolean primeNum() {
		int num=9;
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i*i<=num; i++) { //9
			if(num%i==0 ) {//
				return false;
			}
		}
		return true;
	}
}
