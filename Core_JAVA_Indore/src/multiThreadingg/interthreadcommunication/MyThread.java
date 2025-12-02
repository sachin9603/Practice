package multiThreadingg.interthreadcommunication;

class MyThread extends Thread{
	
	int total=0;
	
	public void run(){
		
		
		synchronized(this) {
			
			for(int i=0;i<=100;i++){
				total=total+i;
				}
				this.notify();
		}
	
	
	}
}
