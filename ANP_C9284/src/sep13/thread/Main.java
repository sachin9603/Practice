package sep13.thread;

public class Main {
	
	public static void main(String[] args) {
		
		A tt  = new A()  ;
		Thread gg  = new Thread (tt) ;
		
		gg.start(); 
		
		try {
			
			gg.join(); // ab main thread tab rukega jab tak gg vala thread aapna akaam pura nahi kar leta 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(tt.sum); //  0   , some patial result  , may get full result 
		
		
		
	}

}
