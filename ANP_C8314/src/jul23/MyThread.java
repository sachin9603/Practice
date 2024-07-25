package jul23;

public class MyThread extends Thread {
	
	
	int total=0;
	
	public void run(){
		
		synchronized (this) {
			
			System.out.println("child thread performing calculation");
			for(int i=0;i<=100;i++){
				total=total+i;
			}
			System.out.println("child thread giving the notification");
			this.notify();
			
			}
	// 5050
	
	}

}
