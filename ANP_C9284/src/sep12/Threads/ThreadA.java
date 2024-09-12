package sep12.Threads;

public class ThreadA  extends Thread{
	
	// vo sara kaam likh do  jo main k parallel chalana hai 
	
	public void run() {
	
		
		for ( int i  = 51  ; i<=100  ;i++) {
			
			
			
			System.out.println( i + "--------------> i am another thread");

		}
	}
	
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
			
			System.out.println( i + "--------------> i am another thread of  threadB ");

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
