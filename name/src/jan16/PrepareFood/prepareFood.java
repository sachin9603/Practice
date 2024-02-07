package jan16.PrepareFood;

public class prepareFood  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println("i am sleeping ");
		Thread.sleep(3000);
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		System.out.println("now i m active ...");
	}
	
	public static void main(String[] args) {
		
		prepareFood  pf  = new prepareFood () ;
		
				
				WashUtensil wu = new WashUtensil () ;
				
				Thread t1 = new Thread(pf) ;
				
				Thread t2 = new Thread(wu) ;
				
				t1.start();
				t2.start(); 
		
	}
	
	
	

}
