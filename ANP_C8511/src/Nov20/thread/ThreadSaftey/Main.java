package Nov20.thread.ThreadSaftey;

public class Main {
	
	
	public static void main(String[] args){
		Common c = new Common(); 
	   Common c2 = new Common();
		//sharing same Common object to two thread
		ThreadA t1=new ThreadA(c ,"Ram");
		ThreadB t2=new ThreadB(c2 ,"Shyam");
		
		
		
		t1.start();
		t2.start();
		
		
	}

}
