package feb14;

public class Demo {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// hai main thread aap ruko jese hi t1 vala thread aapna pura kaam karle usko join karlo 
		
		A a  = new A  () ;
		
		Thread t1  = new Thread(a) ;
		
		t1.start();
		
		//t1.join();// jese  hi  t1 complete hojaaye vese hi main thread execute ho 
		
  //Thread.sleep(1);
		int totalsum  =  a.sum ;
		
		System.out.println(totalsum);
		
		
		
		
	}
	

}
