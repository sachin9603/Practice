package june11;

public class MainMain {
	
	
	public static void main(String[] args) {
		
		Appliance a  = new Appliance() ;
		
		a.setBrandName("Voltas"); 
		
		a.setPrice(42000);
	
		System.out.println(a);
		
		
		Television t1  = new Television() ;  // default  cons .
		t1.setBrandName("ACER") ;
		t1.setLoudness("60db"); 
		t1.setPrice(43000); 
		t1.setSize(32);
		
		System.out.println(t1);
		t1.changeChanel();
		t1.mainFunction();
		
		
		
		Television t2  = new Television( 32  , "45db") ;  
		
		Television t3  = new Television("samsung" , 400000 , 48 , "56db") ; 
		
		
		
		
		
		
		
	}

}
