package multiThreadingg.interthreadcommunication;

class Main{
		
	public static void main(String[] args){
		
		MyThread mt=new MyThread();
		
		mt.start();
		
		
		synchronized(mt) {
			
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		System.out.println(mt.total); //5050
		
		System.out.println("this is multithreading ");
		
		
	
	}

}