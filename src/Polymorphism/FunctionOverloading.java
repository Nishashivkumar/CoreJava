package Polymorphism;

public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * Method overloading is the process that can create multiple methods of the same name in the same class, 
	 * and all the methods work in different ways. 
	 * Method overloading occurs when there is more than one method of the same name in the class.
	*/
	//If we define 2 methods with the same name - Function Overloading 
	//Either argument count should be different or argument data type should be different
	public void getData(int a) {
		
	}
	
	public void getData(int a, int b) {
		
	}
	
	public void getData() {
		System.out.println("Data from Another Class ");
		
	}
	
	public void getData(String a) {
		
	}
	
	

}
