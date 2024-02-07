package feb6;

public class EmployeeFactory {
	
	
	public static Employee getEmoployeeObj(String empType)
	{
		if (empType.trim().equalsIgnoreCase("FRONTEND")) {
			
			return new Frontend() ;
			
		}else if (empType.trim().equalsIgnoreCase("DEVELOPER")) {
			
			return new Developer() ;
			
		}else {
			return null;
			
		}
		
		
		
	}

//	public static Employee getEmoployeeObj(String empType) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
