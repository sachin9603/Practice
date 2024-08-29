package aug27.abstractss;

public class Check22 {
	
	public static void main(String[] args) {
		
		
 	// Car c1  = new Car() ;
		
		Car c2 = new CarBonet() ;//matlab default cons. hit huva hai kiska CarBonet ka 
		// ab iske ander super() or call karta hai iske parent  k cons. 
		
		c2.Breaking(); 
		c2.playMusic();
		
		Car.givingComfort(); // all static method can be accessed from only Class name  
		
		c2.carChacheeNo();
	
	}

}
