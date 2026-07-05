package Practice;

public class Reverse {

	public static void main(String[] args) {
		String name="Selenium";
		String reversed = "";
		
		for (int i=name.length()-1;i>=0;i--) {
			reversed+=name.charAt(i);
			System.out.println(reversed);
		}

	}

}
