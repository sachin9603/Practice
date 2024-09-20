package sep18.thread.ExecutorThreadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	
	
	public static void main(String[] args) {
		
		CallableChild [] newArray  = {
				
				new CallableChild(1) ,
				new CallableChild(10) ,
			
				new CallableChild(100) ,
				new CallableChild(1000) ,
				new CallableChild(10000) ,
				
				
		};
		
		
		ExecutorService  es = Executors.newFixedThreadPool(2) ;
		
		
		for ( CallableChild cc : newArray) {
			
			
			Future pp  = es.submit(cc) ;
			
		try {
			System.out.println(pp.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	}

}
