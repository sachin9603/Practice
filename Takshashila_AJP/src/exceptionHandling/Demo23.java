package exceptionHandling;

public class Demo23 {
	
	
	
	
	public void m() {
		
		
		p()  ;
		
	}
	
	public void p()  {
	try {
		 n();
	}catch(Exception d) {
		
		System.out.println(d.getMessage());
	}
	
	 
	}
	
	public void n() {
		
		int a  = 100/0  ; // yaha par aarha hai exception 
		
		
		
	}
	
	
	public static void main(String[] args) {
		Demo23  k  = new Demo23()  ;
		k.m(); 
		System.out.println("sachin");
	}

}
