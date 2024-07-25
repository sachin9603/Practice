package jul24;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
	
	
	int num  ;
	
	public int vaule() {
		return num ;
	}
	
	public MyCallable(int jjj) {
		
		num  =  jjj ;
	}
	

	@Override
	public Object call() throws Exception {
		int sum  = 0  ;
		for ( int i  =0  ;i<=num  ;i++) {
			sum += i ;
		}
		return sum ;
	}
	
	
	
	
	
}
