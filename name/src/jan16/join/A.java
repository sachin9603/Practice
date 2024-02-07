package jan16.join;

public class A implements  Runnable  {
	int sum  = 0 ;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for ( int i =0  ;i<= 100 ;i++) {
			
			sum = sum+ i  ;
			
		}
		
		
		//System.out.println(sum);
		
	}
	

}
