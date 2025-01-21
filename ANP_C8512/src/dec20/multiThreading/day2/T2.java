package dec20.multiThreading.day2;

public class T2 extends Thread {
	
	
	public void run() {
		
		System.out.println("I will give training to the students after Selection process ");
		
	}
	
	
	
	public static void main(String[] args) {
		
		//System.out.println("I am main method and I am starting the program");
		
		int s = Thread.currentThread().getPriority() ;
		System.out.println(s);
		
		T1 t1  =  new T1()  ;
		
		t1.start(); 
		
		
		T2 t2 = new T2()  ;
		
		try {
			t1.join()  ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start(); 
		
		
		
	///	System.out.println(" Every thing Fine! Now Students can go on floor ");
		
		
	}

}
