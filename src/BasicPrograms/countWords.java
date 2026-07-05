package BasicPrograms;

public class countWords {

	public static void main(String[] args) {
		String word="One Two Three";
		
		for (int i=0;i<=word.length();i++) {
//			System.out.println(i);
			}
		int count =word.split("").length;
		System.out.println(count);
		
//Convert String to array
		String[] array= word.split("\\s");
		String reverseString = array[0];
		System.out.println(reverseString);
		int reverseCount=reverseString.length();
		System.out.println(reverseCount);
		
//		To reverse the String
		for (int i=reverseCount-1;i>=0;i--) {
			System.out.println(reverseString.charAt(i));
		}
		
	}

}
