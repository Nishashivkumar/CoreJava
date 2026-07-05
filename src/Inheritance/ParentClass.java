package Inheritance;

public class ParentClass extends ChildClass {
//	Inheritance in Java is a mechanism where one class is allowed to inherit the fields and methods of another class

//	subclass (child) - the class that inherits from another class -- ParentClass
//	superclass (parent) - the class being inherited from -- ChildClass
	public int i=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		c.Hello();
//		Can call either from the parent class or child class
		ParentClass p = new ParentClass();
		p.Hello();
		
//		ChildClass is the return type so it will pick the value of i in ChildClass
		ChildClass a = new ParentClass();
		System.out.println(a.i);
		

	}
	
	
	
//Multiple Inheritance is not allowed but it will work only in Interface
//	Why And When To Use "Inheritance"?
//	- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

}
