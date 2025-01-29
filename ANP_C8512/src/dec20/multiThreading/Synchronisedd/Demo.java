package dec20.multiThreading.Synchronisedd;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		
		Common c = new Common()  ;
	Common c2 = new Common()  ;
		
		ThreadA t1  = new ThreadA(c , "Ram");
		ThreadB t2  = new ThreadB(c2 , "Shyam") ;
		
		
		t1.start(); // t1.start()  ----- run()  ----c.fun(Ram )
		t2.start();// t1.start()  ----- run()  ----c.fun(Shyam )	}

}
}
