package jul26;

public class MyThread extends Thread {

	int total=0;
	
	public void run(){
		
	
		// 1000 
		synchronized (this) {
			System.out.println("child thread performing calculation");
			for(int i=0;i<=100;i++){
				total=total+i;
			}
			System.out.println("child thread giving the notification");
			this.notify() ;
		}
	//1000  lines 
	}
	
	
}
