package Practice;

public class countWords {

	public static void main(String[] args) {
		String word ="One Two Three";
		System.out.println(word.length());
		String[] splitWord = word.split("\\s");
		System.out.println(splitWord);

	}

}
