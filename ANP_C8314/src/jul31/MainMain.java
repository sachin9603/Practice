package jul31;

public class MainMain {
	
	public static void main(String[] args) {
		
//		Predicate  pp = new Predicate()  ;
//			System.out.println(	pp.check(12) );
		
		
		
		CheckOddEven pppp =  new CheckOddEven () {
			@Override
			public boolean check(int a) {
				// TODO Auto-generated method stub
				if (a%2 == 0) {
					// it even
					return true ;
				}
				return false;
			}
		} ;
		
		
		CheckOddEven pp = (int a) ->  (a%2 == 0);
                        	   
	
				
			
			
	 
		
		System.out.println(pp.check(12));
		
		
		
		
	}

}
