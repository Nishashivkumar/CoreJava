package JavaClasses;

//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
//It can be used to set initial values for object attributes:
public class constructor {
	
	//Name of the constructor should be Class name
	//Constructor will not return any values
	//Default Constructor
	public constructor() {
		System.out.println("I'm in the Constructor");
	}
	
	//Parameterized constructor -- Passing parameters
	public constructor(int a, int b) {
		System.out.println("I'm in parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	public constructor(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm in main block");
		
		//to call a constructor, creation of object is enough, no need to call any method inside it
		constructor c = new constructor();
		// compiler will call implicit constructor if you have not defined constructor block
		constructor cd = new constructor(4,5);
		constructor cds = new constructor("Hello");
	}

}
