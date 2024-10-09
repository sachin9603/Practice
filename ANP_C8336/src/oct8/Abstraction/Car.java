package oct8.Abstraction;

public abstract class Car {  // 0 to 100 abstraction 
	// you can never instantiate this Abstract class 
	
	// we don't know how break applied  // it is showing functionality 
	public abstract void  carBreak() ;
	// abstract method are those method which are written inside the abstract and they dont have body 
	
	
	// it is showing functionality 
	public abstract void  carAccelerate() ;
	
	
	/// concrete method  -----> a method with body 
	public void carColour() {
		System.out.println(" yes it is white ");
	}
	
	private Car(int speed) {
		
		System.out.println("this car can reach at this speed " + speed );
		
	}
	///is there is any constructor  
	
	/// yes it do  have constructor 
	
	public Car() {
		
		this(250) ;
		
	System.out.println("mai hu khaali koi kaam nahi but still playing big role in creating object of child  ");	
	}
	
	public static void bodyMAterial() {
		System.out.println("some steel rubber and platic ");
	}
	
}
