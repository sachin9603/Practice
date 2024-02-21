package feb21;

public class B implements Runnable   {

	int sum  = 0  ;
	
	@Override
	public void run() {
		
		for (int i= 1 ; i<=100; i++) {
			
			sum += i ;
			
		}
		//System.out.println(sum) ;
		
	}
	
	// do tareeke hai multi thread ko execute karne k  
	// extends Tread class
	// implements runnable interface
	
	

}
