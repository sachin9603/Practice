package multiThreadingg.racecondition;
class Main{
	
	public static void main(String[] args){
		
	Common c=new Common(); // 123
	Common c2=new Common(); // 456
	
	//sharing same Common object to two thread
	ThreadA t1=new ThreadA(c,"Ram");
	ThreadB t2=new ThreadB(c2,"Shyam");
	
	t1.start();
	
	t2.start();
	
	
	/// welcomewelcome ram shaym 
	
	// after synchronization  ----welcomeram welcome shaym 
	
	}
}
