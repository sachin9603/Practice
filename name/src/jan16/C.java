package jan16;

public class C implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("inside cccccc " + i);
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			
		
	}
	
	

}
