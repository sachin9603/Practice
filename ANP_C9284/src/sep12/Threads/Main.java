package sep12.Threads;

public class Main {
	
	public static void main(String[] args) {
		
		
		// you need to create object of that classs
		
		ThreadA t1  = new ThreadA() ; // new state 
		t1.setName("Dhoni");
		
		t1.setPriority(10); 
		
		ThreadB t2  = new ThreadB()   ;
				
		t2.setPriority(1);
				
				;
		Threadc t3  = new Threadc()  ;
		
		/// Runnable vala 
		
		ThreadBest t4  = new ThreadBest() ; // first of all you nee to create threaBest object t4 and you need pass this object this thread class 
		
		Thread tt = new Thread(t4) ;
		tt.start(); /// 4 th
		
		
		
		/// time , some condition , unconditionally 
		
		
		
		
		
		
				
		
	//	t1.run(); // it will not work as different thread for running a seprate thread you need to use start()
		
		t1.start(); // from line 14 two thread will active one is main  and another is t1 
		t2.start();
		t3.start(); // Runnable State
		
		t1.running();
		for (int i =0  ;i<=50  ;i++) {
			
try {
				
				Thread.sleep(1000); /// Blocked state 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			 /// Runnable state
			String name  = Thread.currentThread().getName(); 
			System.out.println(i+"-------------> mai hu main" +name  );
		}
		
		// pura kaam main thred naa  kare 
		
		
		// two ways to create new thread 
		// thread class ko extend karna a
		// Runnable interface ko implement karnaa
		
		
	}

}
