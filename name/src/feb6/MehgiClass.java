package feb6;

public class MehgiClass {
	
	// ye class chahti hai ek hi baar obj bane 
	
	// default construtor bana raaha 
	// 1. contrutor ko private kardo 
	
	// 2. obj banao aap ek method se 
	
	// ek private satatic variable  of same class type  
	
	
	
	
	
	private static MehgiClass mgc  ;
	
	
	
	
	private MehgiClass () {
		
	}
	
	
	//  lazy way if creating obj  of particular class 
	public static MehgiClass getobjOFMehgiClass() {
		
		if (mgc == null) {
			
			mgc = new MehgiClass() ;
		}
		return mgc ;
	}

}
