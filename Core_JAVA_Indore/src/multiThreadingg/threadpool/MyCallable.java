package multiThreadingg.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<Object> {

	int num  ;
	
	MyCallable(int n )  {
		this.num = n ;
		
	}
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int sum =0 ;
		
		for (int i=0 ;i<=num  ;i++) {
			sum += i ;
		}
		return sum ;
	}
	
	public static void main(String[] args) {
		
		MyCallable[] jobs = {
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				new MyCallable(60),
				};

		ExecutorService service=Executors.newFixedThreadPool(3);
		for(MyCallable job:jobs){
		Future f= service.submit(job);
		try {
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		service.shutdown();	
	}
	
	

}
