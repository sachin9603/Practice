package jul18;

public class DemoDemo extends Thread{
	
   public void run() {
		
		for (int i = 0 ;i<30  ;i++) {
			
			System.out.println(i+ "second thred");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		DemoDemo x1  = new DemoDemo() ;
		
		// x1.run() ; single thread hi hai abhi ye 
		
		x1.start(); // two threa
		
		for (int i = 30 ;i<=90  ;i++) {
			
			System.out.println(i+ "main thred");
		}
		
		
		
		
	}

}
