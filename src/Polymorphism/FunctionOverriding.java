package Polymorphism;

public class FunctionOverriding extends FunctionOverloading {

	public static void main(String[] args) {
		//Function Overriding
		//Both the methods has same name, parameter and data type 
		//Method inside the main block will execute in overriding
		FunctionOverloading fo = new FunctionOverloading();
		fo.getData();

	}
	
	public void getData() {
		System.out.println("Data from current class");
	}

}
