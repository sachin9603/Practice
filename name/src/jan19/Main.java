package jan19;

public class Main {

	public static void main(String[] args) {
		
		
		Sum s = new  Sum() ;
		
		s.start();
	
		
		Thread.yield();
//		synchronized(s) { // yaha mai Sum obj ka lock use kar rha hu ye make sure karne k liye is block mai obj passs kiya 
//			
//		System.out.println("main will wait and it has been released loack of that obj ");
//		
//		try {
//			s.wait();/// main thread will wait and it will release lock of that s object 
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		}
		
		System.out.println(s.sum);
	}
}
