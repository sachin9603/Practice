package jan16;

public class B implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
    for(int i =21  ;i<=40 ; i++) {
			
			System.out.println("Thread B thread   "+ i);
			
		}	
		
	}
	public static void main(String[] args) {
		
		B b = new B() ;
		Thread t2  = new Thread(b);
		
		t2.start();
		
		
		for(int i =0  ;i<=20 ; i++) {
			
			System.out.println("main thread   "+ i);
			
		}
	}

}
