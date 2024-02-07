package feb6;

public interface EmployeeApp {
	
	
//	public void send() {
//		
//		
//	}

	
	public void saveEmployee() ;;
	public void deleteEmployee() ;;
	public void updatEmployee() ;;
	// interface ki saari method by default abs 
	
	
	static void basicPAy() {
		System.out.println("sabhi ka basic pay 30000 se uper hai ");
	}
	
	  default void  shift() {
		
		  System.out.println("Sabhi ko office  10 k pehle aana hai ");
	}
}
