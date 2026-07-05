package JavaClasses.Encapsulation;

public class encapsulation {
	String name;
	public static void main(String[] args) {
		//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
		person nameChange = new person();
		String getName= nameChange.getName();
		String setName= nameChange.setName("Nisha");
		System.out.println(getName);
		System.out.println(setName);
	}
	
	

}
