package PackageDemo;

public class ClassA {

//	Calling this in ClassB 
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.getNum(0);
		
	}
	
	public void getNum(int a) {
		System.out.println(a);
	}

}
