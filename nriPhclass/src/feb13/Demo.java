package feb13;

public class Demo {

	
	
	public static void main(String[] args) {
		
		Theaddcc  bb  = new Theaddcc() ;
		
		Thread tt  = new Thread(bb) ;
		
		tt.start(); 
		
		
		//Thread.sleep(1000);
		
		try {
			tt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int su  = bb.sum ;
		System.out.println(su);
		
		
		
		
	}
}
