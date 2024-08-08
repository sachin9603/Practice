package Aug8;

public class Testing {
	
	public static void main(String[] args) {
		
		
		Summ obj  = new Summ() {

			@Override
			public void calculation(int s) {
				// TODO Auto-generated method stub
				
			}
			
		} ;
		
		Summ ob  =  s -> System.out.println(s*s) ; // lamda 
		
		ob.calculation(8);
		
		
		Summ obj3  = DifferentClass :: doingSomething ; // static refence 
		
		obj3.calculation(4);
		
		
			
	
		
		
		
		
		
		
	}

}
