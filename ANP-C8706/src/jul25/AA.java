package jul25;

public class AA  extends Thread {
	
	
	public void run () {
		System.out.println(" i am  demon  ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("I am main ");
		AA a  = new AA() ;
		
		a.setDaemon(true); //
		
		a.start(); 
		
		//
	}

}
