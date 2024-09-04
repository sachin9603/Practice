package sep4.factory;

public class Client {
	
	public static void main(String[] args) {
		
		// koi or layer jo ki object banake deke sifr i will instruct 
		
		Employee ee  = EmployeeFactory.getEmployee("Android" ) ;
		
		// this ee is android developer 
		ee.getSalary() ;
		
		
		
		
	}

}
