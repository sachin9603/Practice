package jul24.multi;

public class Demo {
	
	
	public static void main(String[] args) {
		
		// enmployee main is doing this task 
		
		// 1 nano 
		
		
		A a  = new A() ;
		a.setName("piyuuu");
		
		//a.run();  // // it will behave normal method 
		
		a.start() ; // here it will become second thread  
		
		
		
		ASec ss  = new ASec() ;
		
		//ss.run(); // bhai ye as single thread 
		
		Thread t2  =  new Thread(ss) ;
		
		
		
		t2.start(); /// here as third thread will start 
		
		
		
		
		 // but parallel mai ek or thread  0 se 500		
			for ( int i= 21  ;i<= 40  ;i++) {
						
						System.out.println("Main  --->" + i);
					}
	}
}
