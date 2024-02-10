
package feb9;

public class Counter {
	
	static int count  = 0  ;
	
	
	public Counter () {
		count ++ ;
		System.out.println( count);
	}
	
	public static void main(String[] args) {
		Counter  vv  = new Counter() ;
		
		Counter  v1v  = new Counter() ;
		Counter  v3v  = new Counter() ;
		Counter  v2v  = new Counter() ;
	}
	

}
