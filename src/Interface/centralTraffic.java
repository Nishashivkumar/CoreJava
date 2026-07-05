package Interface;

public class centralTraffic implements InterfaceBasics, AustralianTraffic {

	public static void main(String[] args)  {
		// create object of the interface
		InterfaceBasics IB = new centralTraffic();
		AustralianTraffic AT = new centralTraffic();
		
		IB.greenGo();
		IB.redStop();
		IB.yellowWait();
		
		AT.WalkOnSymbol();
		AT.TrainSymbol();
		
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
		
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow wait implementation");
		
	}

	@Override
	public void WalkOnSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Walk On Symbol Implementation");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol Implementation");
		
	}

}
