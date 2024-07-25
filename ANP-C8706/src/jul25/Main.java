package jul25;

public class Main implements Runnable  {
int sum   =  0 ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ye for loop  0 se lkar 100 tak ka sum karega
		
		for (int i   =0  ; i<=100 ;i++) {
			sum  += i  ;
		}
		
	}	// 5050

	///suspending a thread  -- on the baises of time condidition and non condition 
	
	public static void main(String[] args)  {
		Main  obj  = new Main() ;
		
		Thread t  = new Thread(obj) ;
		
		t.start(); 
		// yaha par main thread ko suspend karne ki jarurat hai 
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			t.join();// t thread  jab complete hoga toh use join karega main thread tab tak wait karaega  main thread  
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.sum);
		
	}
	
	
	
	
	
	
	

}
