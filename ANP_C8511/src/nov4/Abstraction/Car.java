package nov4.Abstraction;

public  class Car  extends Vehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("car can drive at 200 km per hr ");
	}
	
	public Car() {
		super(60) ; // vehicle constructor would be called 
		
	}

}
