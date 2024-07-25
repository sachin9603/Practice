package jul24;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mainn {
	
	public static void main(String[] args) {
		
		MyCallable [] arr  = {
			new MyCallable(12),
			new MyCallable(13),
			new MyCallable(15),
			new MyCallable(16),
			new MyCallable(10),
			new MyCallable(100)
			
			
		} ;
		
		ExecutorService service  = Executors.newFixedThreadPool(3);
		
		for(MyCallable job:arr){
			Future f= service.submit(job);
			try {
				System.out.println(" total sum till-------->"+ job.vaule() );
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			service.shutdown() ;
		
		
	}

}
