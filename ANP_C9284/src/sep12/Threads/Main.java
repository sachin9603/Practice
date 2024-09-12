package sep12.Threads;

public class Main {
	
	public static void main(String[] args) {
		
		
		// you need to create object of that classs
		
		ThreadA t1  = new ThreadA() ;
		
		ThreadB t2  = new ThreadB()  
				
				;
		Threadc t3  = new Threadc()  ;
		
		/// Runnable vala 
		
		ThreadBest t4  = new ThreadBest() ;
		Thread tt = new Thread(t4) ;
		
		
		tt.start(); /// 4 th
		
		
		
		
				
		
	//	t1.run(); // it will not work as different thread for running a seprate thread you need to use start()
		
		t1.start(); // from line 14 two thread will active one is main  and another is t1 
		t2.start();
		t3.start();
		
		t1.running();
		for (int i =0  ;i<=50  ;i++) {
			System.out.println(i+"-------------> mai hu main" );
		}
		
		// pura kaam main thred naa  kare 
		
		
		// two ways to create new thread 
		// thread class ko extend karna a
		// Runnable interface ko implement karnaa
		
		
	}

}
