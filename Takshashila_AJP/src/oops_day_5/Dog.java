package oops_day_5;

// dog is a animal 

public class Dog extends Animal  {
	
	
	
	public void eat() {
		
		System.out.println(" eating bones ");
	}
	

	public String eat(String chapati) {
		
		System.out.println(" eating bones ");
		
		return chapati;
	}

	@Override
	public void sound() {
		
		System.out.println("Bhow , Bhoww......");
	}
	
	
	

}
