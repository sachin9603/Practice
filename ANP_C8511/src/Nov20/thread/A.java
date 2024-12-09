package Nov20.thread;

public class A  {
	

	public static void main(String[] args) {
		//yaha se shruru 
		// main thread 
		// multi threading 
		// 1 sec
		
		ThreadA t1  = new ThreadA()  ;
		
	//	t1.run()  ; means over thrread  is not activated means we do'nt  have to use run 
		
		t1.start(); // here two thread activated first is main sec is Thread-0
		
		for ( int i  =1  ;i<=50 ; i++) {
			System.out.println("this is main thread " + i);
		}
	}
}
