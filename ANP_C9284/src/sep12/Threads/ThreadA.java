package sep12.Threads;

public class ThreadA  extends Thread{
	
	// vo sara kaam likh do  jo main k parallel chalana hai 
	
	public void run() {
	
		for ( int i  = 51  ; i<=100  ;i++) { // Runningstate 
			String s  = Thread.currentThread().getName();
		int pri = 	Thread.currentThread().getPriority() ;
			
			System.out.println( i + "--------------> i am another thread"  + s +pri); 
}
	}
	// dead state 
	
	public void running() {

		for ( int i  = 51  ; i<=100  ;i++) {
			
			System.out.println( i + "--------------> ppppppppppppppppppppppppppppi am another thread");

		}
	}

	

}

class ThreadB extends Thread{
	
	// vo sara kaam likh do  jo main k parallel chalana hai 
	
	public void run() {
		
		for ( int i  = 100  ; i<=150  ;i++) {
			
try {
				
				Thread.sleep(1000); /// Blocked state 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			 /// Runnable state
			String name  = Thread.currentThread().getName(); 
			System.out.println( i + "--------------> i am another thread of  threadB "+ name);

		}
	}
	

}

class Threadc extends Thread{
	
	// vo sara kaam likh do  jo main k parallel chalana hai 
	
	public void run() {
		
		for ( int i  = 151  ; i<=200  ;i++) {
			
			System.out.println( i + "--------------> i am another thread of  threadccccc ");

		}
	}
	

}
