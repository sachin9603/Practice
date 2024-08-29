package aug27.abstractss;

public abstract class Car {
	
	// do have break  ,   accelatration k liye  accelator    , horn  , wiper  , gear   
	// ander ki process nahi pata hai  chuppa di gyi humse   hum hai user 
	// sowing functionality  and hiding complexity  
	
	
	public abstract  void Breaking();
	
//	{
//		// oil  push hota 
//		// kese kaam kar ragi hai ye method 
//	}
	
	// astract class ka object nahi banata hai 
	// aapko iske implemetation k liye ek sub class banan badegi 
	
	
	// abstrct method
	public abstract void playMusic() ;
	
	
	// non abstract method , concrete method 
	public void showingCarColor() {
		System.out.println("gun Metal color ");
		
	}
	
	
	public static void givingComfort() {
		System.out.println("yes i am giiving comfort ");
	}
	
	public final void carChacheeNo() {
		System.out.println("and you cant change this chasee no  6293634962946");
	}

	
	public Car() {
		
		this(100);
		System.out.println("mai hi car ka contructor jo ki by default hi call lho raha hai ");
	} ;
	
	// do abstrct method have private contructor 
	
	
	// priavate 
	
	private Car(int speed) {
		System.out.println("speed of car is " +speed);
	}
	
}
