package nov_14;

public class X  extends Thread{
	
	// now this classs have capacity to create its own thread 
	
	@Override
	public void run() {
		
	// isi method mai vo saari chije likhna hai jo main thread k pallel aap run karnaa 
		
		for ( int i =1 ; i<=50  ;i++) {
			System.out.println("I am x Thread " + i);
		}
	
		
	}
	
	
	public static void main(String[] args) {
		
		X  xx  =  new X()  ;
		
		//xx.run();  if you are using run method then it will act as normal method not as multi thread 
		//if you want to run as multithread then 
		
		
		xx.start();// from this time there will two thread now 
		
		
		for ( int i =51 ; i<=100  ;i++) {
			System.out.println("I am main Thread " + i);
		}
		
		
	}

}
