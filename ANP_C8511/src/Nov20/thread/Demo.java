package Nov20.thread;

public class Demo extends Thread  {
	
	int sum  = 0 ;
	
	public void run () {
		
		//1000 line 
		synchronized(this) {
			// 
			for (int i =0  ;i<= 100   ;i++) {
				sum  = sum  + i ;
			}
			// 
			this.notify();
		}
		//1000 line 
	}
	
	public static void main(String[] args) {
		
		
		Demo d = new Demo ()  ;
		
		d.start();
		
		synchronized(d){ // main thread will release the lock of this d object 
			
			
			try {
				// main thread call the wait method 
				d.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
//		
//		try {
//			d.join(); // yaha par main thread rukega jab tak d ki run method method puri nahi ho jaati hai 
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		System.out.println(d.sum);
		
		
		
	}
	

}
