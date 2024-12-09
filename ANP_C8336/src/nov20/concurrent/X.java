package nov20.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class X implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Thread is doing this task  " + Thread.currentThread().getName());
		
		int sum  = 0  ;
		
		for ( int i  =0  ;i<= 100  ;i++) {
			sum += i ;
			
		}
		
		
		
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		X x1  = new X() ;
		
		ExecutorService service  = Executors.newFixedThreadPool(1) ;
		
		Future s = service.submit(x1) ;
		
		try {
			System.out.println(s.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service.shutdown();
		
		
	}
	

}
