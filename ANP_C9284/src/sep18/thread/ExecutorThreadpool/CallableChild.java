package sep18.thread.ExecutorThreadpool;

import java.util.concurrent.Callable;

public class CallableChild  implements Callable {
	
	
	int num  ;
	
	
	CallableChild (int number  )  {
		this.num  = number  ;
		
	}
	
	

	@Override
	public Object call() throws Exception {
		int sum  = 0  ;
		
		
		System.out.println("job started by  this thread  " +  Thread.currentThread().getName()   +" it will print sum till nums ");
		for(int i = 0  ;i<=  num  ;i++ ) {
			sum  = sum + i  ;
			
		}
		
		return sum;
	}

}
