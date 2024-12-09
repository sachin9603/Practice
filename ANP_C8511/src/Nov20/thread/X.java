package Nov20.thread;

public class X implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i  =51  ;i<= 100 ; i++) {
			
			String s = Thread.currentThread().getName() ;
			
			System.out.println("This is Another thread by Runnable -->" + s);
		}
	}
	
	
	public static void main(String[] args) {
		
		X x  = new X()  ;
		
		Thread t = new Thread(x) ;
		
		t.start();
		
		t.setName("Dhoni");
		
		t.setPriority(1);
		// 1 for minimum  
		
		// 5 for default 
		// 10 for maximun
		
		
		for ( int i  =1  ;i<= 50 ; i++) {
			System.out.println("This is main thread -->" + i);
		}

		
	}

}
