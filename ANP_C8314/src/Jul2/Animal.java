package Jul2;

public class Animal {
	
	
	void doCalulation() throws wrongCalcultion{
		
		int a  = 2  ;
		int b  = 3  ;
		int c  = 4 ;
		
		if(c != 5 ) {
			throw new wrongCalcultion ("aapka ans galat hai ") ;
			
		}else {
			System.out.println("yes it is correct ");
		}
		
		
		
	}

}
