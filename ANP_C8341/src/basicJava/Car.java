package basicJava;

 public class Car {
	
	int wheel ;
	
	int bootspace ;
	
	String typeOfCar ;  // sedan  , suv , hatchback 
	
	 void  speed() {
		System.out.println( "it can run upto 100  km/hr");
	}
	 
	 
	 public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		this.wheel = wheel;
	}


	public int getBootspace() {
		return bootspace;
	}


	public void setBootspace(int bootspace) {
		this.bootspace = bootspace;
	}


	public String getTypeOfCar() {
		return typeOfCar;
	}


	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}


	//public Car() {}


	protected Car(int wheel, int bootspace, String typeOfCar) {
	//	super();
		this.wheel = wheel;
		this.bootspace = bootspace;
		this.typeOfCar = typeOfCar;
	} ;
	 
	public Car() {}
	

}
