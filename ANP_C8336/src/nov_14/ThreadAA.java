package nov_14;

public class ThreadAA  implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for ( int i =1 ; i<=50  ;i++) {
			// Running State 
			
			if (i == 10 ) {
				try {
					Thread.sleep(3000);
					// blocked state 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// it will again go to runnable state 
			}
			
			String name  = Thread.currentThread().getName() ;
			
			System.out.println("I am  + " + name+"  Thread " + i);
		}// Dead State 
		
		
	
	}
	
	
	public static void main(String[] args) {
		ThreadAA a = new ThreadAA()  ;
		
		Thread t1  = new Thread(a) ; // new state 
		
		Thread t2  = new Thread(a) ;
		Thread t3  = new Thread(a) ;
		
		t1.setName("BahuBali");
		t2.setName("Dhoni");
		t3.setName("Virat");
		
		
		
		t1.start();  // Runnable state 
		t2.start(); 
		t3.start(); 
		
		
		for ( int i =50 ; i<=100  ;i++) {
			String name  = Thread.currentThread().getName() ;
			
			System.out.println("I am " +name+ "  Thread " + i);
		}
	
		
		
	}

}
