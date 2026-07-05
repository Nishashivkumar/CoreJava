package Methods;

public class JavaRecursion {

	public static void main(String[] args) {
//		Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
		
		int result = sum(10);
		System.out.println(result);
	}
	
	public static int sum(int n) {
		if(n>0) {
		 return	n=n + sum(n-1);
		}
		
		else {
			return 0;
		}
	}

}
