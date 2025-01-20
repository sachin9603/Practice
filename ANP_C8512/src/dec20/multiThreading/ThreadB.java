package dec20.multiThreading;

public class ThreadB extends Thread  {
// i will create a new Thread
	
	// few steps  --- extends Thread 
	// implement run() method 
	
	
	public void run(){
		
		callName("VAIBHAV");
		for (int i =50  ; i<= 100  ;i++) {
			System.out.println("Sachin -------- Thread ------>"+ i);
		}
		
	}
	
	
	public void callName(String Name) {
		
		System.out.println("Welcome -----" + Name );
	}
	
	
	
	
	
}
