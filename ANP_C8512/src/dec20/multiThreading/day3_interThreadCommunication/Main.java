package dec20.multiThreading.day3_interThreadCommunication;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		MyThread obj  = new MyThread()  ;
		
		
		obj.start(); 
		
		synchronized(obj) {
			
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int  k =obj.num ;
			System.out.println(k);
		}
		
		
		
	}

}
