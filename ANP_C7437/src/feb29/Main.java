package feb29;

public class Main {
	
	public static void main(String[] args) {
		
		Common c1  = new Common() ;// c1 object ka ek lock hai 
		
		
		Common c  = new Common() ;
		
		ThreadA  a  = new ThreadA( c1 , "sachin") ;
		
		ThreadB b  = new ThreadB( c , "POOJA" ) ;
		
		a.start(); 
		b.start();
		
		//static synch  ko access karne k liye you need class level lock 
		
		
		
	}

}
