package feb13;

public class MultiThreaddd2 implements Runnable  {
// you have to choose using Interface 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		String name   = Thread.currentThread().getName() ;
		Thread.currentThread().setPriority(10);
		int prio   = Thread.currentThread().getPriority() ;
		for ( int i = 60 ;i<= 65  ;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 System.out.println("mai hu MultiThreaddd thread    " + i +  name +"------->>>>"+ prio ); 
		 }
		
	}

	
	
	

}
