package feb15;

public class BB extends Thread{
	
	int sum  =0  ;
	String sss  = " RAJA" ;
	@Override
	
	public void run() {
		
		
			System.out.println(" yes you can eat " +sss);
		
		
		//System.out.println();
		synchronized(this) {
			for ( int i =0 ;i<=100 ;i++ ) {
				sum +=i  ;
			}
			
			System.out.println(" kaam pura huva mai kar rhahu aapko notify ab");
			
			this.notify();
		}
		
	}

	
	
}
