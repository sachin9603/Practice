package sep4;
// car factory
public class Car {
	
	public String body ;
	
//	that was tight coupleddd 
//	// dependent on some other class  
//	public ElectricEngine  engine  ;
	
	public Engine engine ;
	

	public Car(String body, Engine engine) {
	
		this.body = body;
		this.engine = engine;
	}
	
	
	
	public  void start() {
		engine.show();
		System.out.println("now you have idea so you can start ");
		
	}
	
	
	
	

}
