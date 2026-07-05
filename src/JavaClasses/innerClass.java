package JavaClasses;

public class innerClass {
	int x=5;
	class innerClass2{
		int y=10;
	}

	public static void main(String[] args) {
		
		innerClass outerClass = new innerClass();
		innerClass.innerClass2 innerClass = outerClass.new innerClass2();
		System.out.println(outerClass.x + innerClass.y);
	}

}
