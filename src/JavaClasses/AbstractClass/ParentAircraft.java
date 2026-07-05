package JavaClasses.AbstractClass;

//If the class contains any abstract method, then the class should also have abstract keyword
public abstract class ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ParentAircraft PA = new ParentAircraft();//Cannot instantiate Abstract Class
	}
	
	public void engine() {
		System.out.println("Follow engine guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow Safey Guidelines");
	}
	
//	astract method
	public abstract void bodycolor();

}
