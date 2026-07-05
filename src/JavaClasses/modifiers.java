package JavaClasses;

public class modifiers {
	final int x=10;
	final double PI=3.14;
	
	public static void main(String[] args) {
//		Access Modifiers - controls the access level -- public, private, default, protected
//		Non-Access Modifiers - do not control access level, but provides other functionality -- final, abstract
		
		modifiers myObj = new modifiers();
//		myObj.x=12; // will generate an error: cannot assign a value to a final variable
		
//		Calling Static method
		myStaticMethod();
		
//		Calling Public method
		modifiers myPubMet = new modifiers();
		myPubMet.myPublicMethod();
	}
	
	public static void myStaticMethod() {
		System.out.println("Static methods can be called without creating the object of it");
	}
	
	public void myPublicMethod() {
		System.out.println("Public method has to be called by creating the object");
	}
	
//	Default Modifier --> No Keyword is required, If there is no access modifier in the method, then default access modifier will be applied and it is accessible to all the packages
//  Private Modifier --> Can be accessed only inside the Class which they're declared, not in any other outer class 
//	Public Modifier --> The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
//  Protected Modifier --> Can be accessed within the package or subclasses in different packages
}
