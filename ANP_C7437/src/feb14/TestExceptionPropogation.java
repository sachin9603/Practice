package feb14;

public class TestExceptionPropogation {
	Object bb = "Sachin" ;
	
	
	void m() {
		System.out.println("first Line of M");

		 int data  = 50 / 3 ;
		 System.out.println(data) ;
		System.out.println("last Line of M");
	}
	
	void n () {
		System.out.println("First  line of N ");
		m() ;
		
		System.out.println("last line of N ");
	}
	
	
	void p () {
		System.out.println("First  line of p");
		try {
			n() ;
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			System.out.println(" mai toh har baar chalunga ");
		}
	
		
		System.out.println("last line of  p ");
	}
	public static void main(String[] args) {
		
		System.out.println("first line of main ");

		TestExceptionPropogation  jj   = new TestExceptionPropogation() ;
		jj.p() ;
		
		jj = null  ;
		
		
		//System.out.println("last line of N ");
		System.out.println("last line of main");

		
		
		System.gc();
	  
	}
	
	@Override
	protected void  finalize()   {
		System.out.println("just before garbage collected ");
	}
	

}
