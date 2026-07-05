package PackageDemo;

import Methods.Methods;

public class ClassB {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.getNum(2);
		
//		Calling method from a class from different package
		Methods meth = new Methods();
		Methods.getData();//Calling static method
		meth.getValue();

	}

}
