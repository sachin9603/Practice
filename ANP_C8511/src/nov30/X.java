package nov30;

public class X extends Thread {
	
	@Override
	public void run() {
		
		//  - 51 -  100
				for (int i  =51  ;i<=100  ;i++) {
					String name  = Thread.currentThread().getName() ;
					System.out.println("i am Thread-0 method "+ name +"---->"+ i );
			}	
	}
	
	//0 - 100
	public static void main(String[] args) {
		
		X x =  new X() ;
		
		x.start(); 
		
		// 1 - 50 
		for (int i  =0  ;i<=50  ;i++) {
			System.out.println("i am main method " + i );
	}
	
	
	
		
System.out.println("end of main");
}
}
