package jan16;

import java.util.Comparator;

public class F  implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("inside run " + i );
			try {
			Thread.sleep(3000);
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
		
		
			System.out.println("end of run()...");

	}
	
	
	public static void main(String[] args) {
		
		
		
		F f = new F() ;
		
		Thread t = new Thread(f) ;
		
		t .start();
		
		
		
	}

}
