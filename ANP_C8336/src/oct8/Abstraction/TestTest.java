package oct8.Abstraction;

public class TestTest {

	
	public static void main(String[] args) {
	//	Car c  = new Car()  ;
		
		Car  a = new CarFactory()  ;
		
		a.carAccelerate();
		a.carBreak();
		a.carColour();
		
		Car.bodyMAterial();
		
		
		WhatsUpImpl obj  = new WhatsUpImpl() ;
		
		obj.appyStatus();
		
		
	}
}
