package BasicPrograms;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 ="Silent";
		String string2="Listen";
		
		char a[]= string1.toCharArray();
		char b[]=string2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}

	}

}
