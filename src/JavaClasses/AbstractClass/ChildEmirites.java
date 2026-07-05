package JavaClasses.AbstractClass;

public class ChildEmirites extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites c = new ChildEmirites();
		c.bodycolor();
		c.engine();
		c.safetyGuidelines();
		
		ParentAircraft p = new ChildEmirites();
		p.bodycolor();
		
		//Abstract classes cant be instantiated
//		ParentAircraft p = new ParentAircraft();

	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Body color is red");
		
	}

}
