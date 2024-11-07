package nov6;

public class Demo<T>{
	public Demo() {};
	T box  ;

   Demo(T   b ) {
		this.box  = b ;
		
	}
	
	public static void main(String[] args) {
		
		Demo<Integer> d   = new Demo(23232) ;
		
		
		
		
	}

}
