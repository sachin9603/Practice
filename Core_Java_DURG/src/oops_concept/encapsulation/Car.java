package oops_concept.encapsulation;

public class Car {
	
	private Engine engine ;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	
	
	
	
	
	

}
