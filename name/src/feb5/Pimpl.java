package feb5;

public class Pimpl  implements  P{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		// Anonymous class 
		P nn=  new P (){
			@Override 
			public void sayHello() {
				// TODO Auto-generated method stub
				
				System.out.println("Aschin");
				
			}
	        
		} ;
	
		
		P un=  new P (){
			@Override 
			public void sayHello() {
				// TODO Auto-generated method stub
				
				System.out.println("this is second Anonymous class ");
				
			}
	        
		} ;
		
		// using our interface with the help of lamda 
		
	// name return type hata do 
		
		
		
		P oo = ()-> System.out.println(" this is first time i am using lamda ");
		oo.sayHello();
		
		
 		
		
		
		
		
		
	}

	
	
}
