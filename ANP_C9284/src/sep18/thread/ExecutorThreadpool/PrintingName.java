package sep18.thread.ExecutorThreadpool;

public class PrintingName  implements Runnable{
    
	String name  ;
	
	PrintingName(String name) {
		
		this.name  = name  ;
	}
	
	public void run() {
		
		System.out.println(name +"   --job started by  -->" +Thread.currentThread().getName() );
		
		try {
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name +"   --job Done by  -->" +Thread.currentThread().getName() );

		
	}
	
	
}
