package oct21.Encapsulationnn;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Jaadu  jj = new Jaadu() ;
		String s  = jj.alienSuit  ;
		
		
		Alien kk  = new Alien () ;
		
	    String ks  = 	kk.alienSuit ;
	    kk.specialPower();
	    
	    
	    Student jh  = new Student() ; 
	   // jh.name = "Phaagoon " ;
	    jh.setName("Phaagoon");
	    jh.setAdress("Kuravar");
	    jh.setId(9090)  ;
	    
	    System.out.println(jh.getName());
	    
	    System.out.println(jh);
		
		
		
	}

}
