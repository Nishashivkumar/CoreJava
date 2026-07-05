package Interface.Example;

public interface Area {
//	Interface is a method without body.  It is used to achieve abstraction and multiple inheritances in Java
	
	public void Square();
	public void Triangle();
	public void Circle();
	public void Rectangle();

}

/*To declare an interface, use the interface keyword. It is used to provide total abstraction. 
  That means all the methods in an interface are declared with an empty body and are public 
  and all fields are public, static, and final by default. A class that implements an interface 
  must implement all the methods declared in the interface. To implement the interface, 
  use the implements keyword. */
