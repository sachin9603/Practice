package feb12;

public class Multi implements Runnable , Comparable<Multi>{
	
	
// run method k ander vo saari method likhna hai jo aap main thread k parallel mai chalana  chhate 
//	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i  = 1  ;i<=50  ;i++) {
			System.out.println("inside Run method -----> " + i);
		}
	}
//	
	public static void main(String[] args) {
		
		//steps to run multiple  thread  ---implements Runnable ,  void run()  , obj banao main method k ander 
		Multi obj   = new Multi() ;
		
	//	obj.run(); it will act as normal thread 
		
		Thread t1  = new Thread(obj) ;
		
		t1.start() ;
		
	for (int i  =60  ;i<= 100  ;i++) {
			System.out.println("inside main method " + i);
		}
		// main thread se dusare thread call karna padega 
		
	}




}
