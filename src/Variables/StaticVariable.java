package Variables;

public class StaticVariable {
	
	//Instance Variables
	static String name;
	static String address;
	
	//Class Variable - Static Variables are Class Variables
	static String city;
	static int i;
	
	//Static Block - Initializing static variables in a block
	static {
		city="Bangalore";
		i=0;
		}
	
	
//	Constructor
	public StaticVariable(String name, String address) {
		//local variables
		this.name= name;
		this.address=address;		
	}
	
	public void getData() {
		
		System.out.println(name + " " + "is living in" + " " + address + "," + city );
		
	}
	
	//static methods are called class methods, no need of creating object for it
	//only static variable can be accessed in static method
	public static void getAddress() {
		System.out.println(address + " " + city);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable st = new StaticVariable("Nisha","BDS Nagar");
		st.getData();
		StaticVariable st2 = new StaticVariable("Manoj", "Narayanpura");
		st2.getData();
		
		//calling static method
		StaticVariable.getAddress();
		i=5;
		System.out.println(i);

	}

}
