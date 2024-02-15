package feb15;

public class DDDemo {
	
	public static void main(String[] args) {
		
		ClassAA a  = new ClassAA() ;// classA ka lock 
		
		ClassBB b  = new ClassBB() ; // classB ka lock 
		
		ThreadA t1  =  new ThreadA(a , b);
		
		ThreadB t2  = new ThreadB(a , b) ;
		
		t1.start(); 
		
	    t2.start();
		
		
		
	}

}
