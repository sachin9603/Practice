package nov19;

public class Test {

	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread() ;
		
		mt.start(); 
		
		// main thread ko wait karana hai
		
		
		synchronized(mt) {
			// this is getting lock of mt object 
			
			
			// jab tak ki mt obj ka syncroniezed block isko notify naa karde 
			// main thread hi wait ko call kar raha ahi 
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("now it got notification from that class ");
		}
		
		
		
		System.out.println(mt.num );
		
	}
}
