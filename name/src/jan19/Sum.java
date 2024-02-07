package jan19;

public class Sum  extends Thread {
	
	int sum = 0 ;
	
	@Override
	public void run() {
		
	//	synchronized(this) {
			
		System.out.println("yaha par usi obj ka lock use hoga and ");
			
			for ( int i =0  ;i<= 100  ;i++){
				sum += i ;
			}
		//	this.notify();
			
			System.out.println("nottify kar diya hai ki kaam ho gaya hai ");
			
			
		//}
		
		
		
		
	
		
	}

}
