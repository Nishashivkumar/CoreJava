package KeywordDemo;

public class ChildClass extends ParentClass{
	String name ="ABC";//local variable
	
	//Super keyword with String 
	public void getData() {
		System.out.println(name + " Name is from local variable");
		
		//To call the data from parent class, should use super keyword
		System.out.println(super.name + " Name is from Parent Class");
	}
	
	//Super keyword for Methods
	public void getStringData() {
		super.getStringData();
		System.out.println("I'm in Child Class method");
	}
	
	//Super keyword for Constructor
	public ChildClass() {
		//Calling Parent Class Constructor
		super();
		System.out.println("I'm in Child Class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		c.getData();
		c.getStringData();
	}

}
