package feb5;

public class Car {
	
	int bootSpace   ; // in liter 
	
	int milege ;
	
	String brand ;
	
	
	
	public void speed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i can run at 100km/hr");
	}
	
	
	

}
