package march1;

public class PrintJob implements Runnable {
	String name;
	
	PrintJob(String name){
		
	this.name=name;
	}
	
	public void run(){
	System.out.println(name +" job started by Thread :"+Thread.currentThread().getName());
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(name +"..job completed by Thread :"+Thread.currentThread().getName());
	}

	
	

}
