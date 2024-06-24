package june24.interfaceee;

public class Mahindra implements Car ,Truck {

	@Override
	public void acceleration(int force) {
		// TODO Auto-generated method stub
		
		System.out.println("yes speed is increasing at rate of 20km /sec square");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
		System.out.println("yes brake applied ");
		
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		
		System.out.println(" yes there is professional horn ");
		
	}

	@Override
	public void heavyLoad() {
		// TODO Auto-generated method stub
		
		System.out.println("only pick truck can be both car as well as truck ");
	}

}
