package jul24.multi;

public class A extends Thread {
	// first way 
	// is method k ander jo bhi likhoge vo as parallel chalega of main thread 
	
	@Override
	public void run() {
		String tttt = Thread.currentThread().getName();
		
		
		for ( int i=1  ;i<=20  ;i++) {
			
			
			System.out.println(tttt+"  --->" + i);
		}
		
	}
	
	

}
