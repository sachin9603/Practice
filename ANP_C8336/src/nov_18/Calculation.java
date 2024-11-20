package nov_18;

public class Calculation extends Thread {
	int sum  = 0  ;
	public void run() {
		
		for ( int i =0  ;i<=100 ;i++) {
			
			sum = sum+ i ; // 5050
			
		}
	}
	
	public static void main(String[] args) {
		
		Calculation c  = new Calculation() ;
		
		
		c.start() ;
		
		try {
			c.join();// jab  c ki run method complete ho jaaye tab shuru hon ahai 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("total sum "  + c.sum);
		
		
	}

}
