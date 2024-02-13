package feb12;

public class ThreadB extends Thread {
	
	// inheritance property khtm hogye 
	
	
 void get () {
	 System.out.println(" thread B ki getttttttt method ");
 }
 
 
	 @Override
	 public void run() {
		 for ( int i =60  ;i< 80  ;i++) {
			 System.out.println(" i am thread B ----" +  i);
		 }
		 
		 get();
		 
	 }

}
