package feb6;

public class EmpFactory {
	
    
	public Employee getemployee(String empType) {
	
		if (empType.equalsIgnoreCase("web Developer")) {
			return new webdev() ;
			
		}else {
			return new Tester () ;
		}
		
	}

}
