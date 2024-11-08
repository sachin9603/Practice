package nov8.Exception;

public class NullPonterExample {
	
	
	public static void main(String[] args) {
		
		
		String s = null ;
		
		//System.out.println(s.length());
		
		try {
			System.out.println(s.length());
		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		
		System.out.println("1000 line of code is also there after line 11");
		
	}

}
