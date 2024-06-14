package june13.staticcccc;

public class Counter {
	
	
  static int count  = 0 ;
	
	public Counter() {
		count++ ;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Counter  c = new Counter() ;
		Counter  c1 = new Counter() ;
		Counter  c2 = new Counter() ;
		
		Counter  c222 = new Counter() ;
		Counter  c21 = new Counter() ;
		Counter  c22 = new Counter() ;
		
		
	
	}

}
