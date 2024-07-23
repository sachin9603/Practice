package jul19;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<20;i++){
			String tname  = Thread.currentThread().getName() ;
			if(tname.equals("Raaju")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(tname +" is running ");
			}
		
	}
	
	

}
