package feb21;

public class B implements Runnable   {

	int sum  = 0  ;
	
	@Override
	public void run() {
		//yaha 
		// 1000 line ka code likha hai 
		
		for (int i= 1 ; i<=100; i++) {
			sum = sum + i ;
		}
		
		//10000 line ka code yaha par bhi lkiha ha 
		
		//System.out.println(sum) ;
		
	}
	
	// do tareeke hai multi thread ko execute karne k  
	// extends Tread class
	// implements runnable interface
	
	

}
