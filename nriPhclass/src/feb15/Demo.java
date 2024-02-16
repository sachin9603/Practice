package feb15;

public class Demo {
public static void main(String[] args) {
	
	BB t1  = new BB() ;// jab obj bantahai tab uska lock bhi uske banatahi 
	t1.start();
	System.out.println(t1.sss);
	synchronized(t1) {
		try {
			
			t1.wait();// lock release
				
				System.out.println(" main fir se chalu hogaya ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.sum);
		
	}
}
}
