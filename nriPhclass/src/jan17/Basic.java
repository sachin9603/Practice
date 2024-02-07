package jan17;

public class Basic {
	
	public static void main(String[] args) {
		
		
		Animal a = new Animal() ;
		
	int legs = 	a.legs ;
	System.out.println(legs);
		
		
	int t  =	a.add(3, 4) ;
	System.out.println(t);
	
	// kya mujhe likhte vakt hi pata chal gaya gaya tha ki konsi add method use ho rahi hai 
	
	
	int y  =	a.add(3, 4 , 2) ;
	
	int yr  =	a.add(3, 4 ) ;
	
	// compiletime polymorphism ---- method overloading 
	
	System.out.println(y);
	
	Animal aa = new Dog() ;
	
	
	a.sound();
	
	aa.sound();
		
	}

}
