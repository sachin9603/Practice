package sep17.thread;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		MyThread tt  = new MyThread() ;
		
		tt.start(); 
		
		 // tt.join(); we can suspend this main thread 
		
		// Thread.sleep(1000);
		
		
			synchronized(tt) { // here we are using  lock of tt object (object level lock )
				
				try {
					tt.wait(); // it will release the lock 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  //
			}
			
	
		
		
		System.out.println(tt.num);
	
		
		
		
		
	}

}
