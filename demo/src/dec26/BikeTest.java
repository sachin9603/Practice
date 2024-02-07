package dec26;

public class BikeTest {
public static void main(String[] args) {
	
	// default conbstructor ka use ho raha hai
	
	Bike b1  = new Bike();
	
	b1.speed(95);
	b1.speed(); // no need line will be print 
	
	System.out.println(b1.speed(100 , 2));
	
	Honda h  = new Honda() ;
	// initially it was calling its parent class speed 
	h.speed();
	
	System.out.println(h.speed(10, 2));
	
	
	
}
}
