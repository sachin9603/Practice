package jul18;

public class ThreadBB implements Runnable{ // SAM

	@Override
	public void run() {
		
    for (int i = 0 ;i<30  ;i++) {
			
			System.out.println(i+ "second thred");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ThreadBB tt  = new ThreadBB() ;
		
		Thread sec  = new Thread(tt) ;
		
		
		sec.start(); 
		
		
for (int i = 30 ;i<=90  ;i++) {
			
			System.out.println(i+ "main thred");
		}
		
		
		
		
		
		
	}


}
