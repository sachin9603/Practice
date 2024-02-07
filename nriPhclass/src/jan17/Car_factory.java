package jan17;

public class Car_factory extends Car {
	
	
//	public Car_factory() {
//		
//		super() ;// ye use ho ta hai parent class  k contructor ko call karne k liye 
//		
//		
//	}
	
	static String carBrand = "Honda";
	
	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		
		System.out.println("car is getting deaccleration  with -10m/second squre");
		
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		
		System.out.println("car is acclerating  with 10m/second squre");
		
		
	}

}
