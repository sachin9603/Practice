package jan31;

public class propogation {
	
	
	void m() {
		System.out.println("mai hu m 1");
		int s  = 40 / 0 ;// error 
		System.out.println("mai hu m 2");
	}
	
	
	void n() {
		System.out.println("mai hu n 1");
		m() ;
		System.out.println("mai hu n 2");
	}
	
	void p () {
		System.out.println("mai hu p 1");
	
		
		try {
			n() ;
		}catch(Exception e){
			System.out.println("exception handled");}  
		
		System.out.println("mai hu p 2");
	  }  
		
	
	public static void main(String[] args) {
		
		propogation p  = new propogation() ;
		 
		p.p(); 
		
		
		System.out.println("normal flow");
		
		
	}
	
		
	}

