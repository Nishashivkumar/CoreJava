package Methods;

public class Methods {

	public static void main(String[] args) {
System.out.println("Hello");
		
		//Creation of Object - Object is the instance or reference of Method
		//To call the method in main method which is not in main method then object of the class has to be created in main method
//		method1 fc = new method1();
//		fc.getValue();
//		
//		Method2 sc = new Method2();
//		sc.main();
		
		getData();

	}
	
//	An object has to be created to call this method
	public String getValue() {
		String a = "This is from first Class";
		System.out.println(a);
		return a;
		
	}
	
//No need to create an object to call, can be directly called as its STATIC
	public static String getData() {
		String a = "This is from second static method";
		System.out.println(a);
		return a;
		
	}

}
