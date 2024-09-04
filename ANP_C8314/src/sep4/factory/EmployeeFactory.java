package sep4.factory;

public class EmployeeFactory {
	
	// this is the class which will create the obect for you  
	// andoid developer yaa webdeveloper 
	
	// abstract factory 
	
	public static Employee getEmployee(String EmpType) {
		
		if(EmpType.trim().equalsIgnoreCase("Android")) {
			
			return new AndroidDeveloper();
			
		}else if (EmpType.trim().equalsIgnoreCase("Web")){
			
			return new Webdeveloper() ;
			
		}else {
			return null ;
			
		}
		
		
	}
	

}
